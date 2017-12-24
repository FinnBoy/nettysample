package com.awaken;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class SelectorServer {

    public static void main(String[] args) throws Exception {

        Selector selector = Selector.open();

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8080));

        serverSocketChannel.configureBlocking(false);
        // 将Channel注册到Selector上，并指明让Selector监听到Channel事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            int n = selector.select();
            if (n == 0) {
                continue;
            }

            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();

            while (iterator.hasNext()) {

                SelectionKey selectionKey = iterator.next();

                if (selectionKey.isAcceptable()) {

                    ServerSocketChannel ssc = (ServerSocketChannel) selectionKey.channel();

                    SocketChannel socketChannel = ssc.accept();
                    System.out.println("accept from client");

                    socketChannel.configureBlocking(false);
                    SelectionKey key = socketChannel.register(selector, SelectionKey.OP_READ);
                    // ?
                    // key.cancel();
                    // key.interestOps();
                    // key.interestOps(SelectionKey.OP_WRITE);

                } else if (selectionKey.isReadable()) {
                    // 有数据来时，才 可读
                    SocketChannel sc = (SocketChannel) selectionKey.channel();
                    read(sc);

                } else if (selectionKey.isWritable()) {
                    // Socket空闲时，即为 可写
                }

                iterator.remove();
            }
        }

    }

    private static void read(SocketChannel socketChannel) throws Exception {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        int count;

        while ((count = socketChannel.read(byteBuffer)) > 0) {
            byteBuffer.flip();
            byte[] bytes = new byte[byteBuffer.remaining()];
            byteBuffer.get(bytes);
            System.out.println("read from client:" + new String(bytes));
        }
        if (count < 0) {
            socketChannel.close();
        }
    }
}
