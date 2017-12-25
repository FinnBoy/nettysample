package com.awaken.echo.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;

public class EchoServer {

    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.err.println("Usage: " + EchoServer.class.getSimpleName() + " ");
            return;
        }

        // 设置端口值
        int port = Integer.parseInt(args[0]);

        // 调用服务器的start()方法
        new EchoServer(port).start();
    }

    public void start() throws Exception {

        // ServerBootstrap 需要配置的项目如下：
        // 事件Event、地址/端口Address、通道Channel、通道事件响应执行器

        final EchoServerHandler serverHandler = new EchoServerHandler();

        // 2. 创建并分配一个 NioEventLoopGroup 实例，以进行事件的处理
        // 如：接收新连接以及读/写数据
        EventLoopGroup group = new NioEventLoopGroup();

        try {
            // 1. 创建一个 ServerBootstrap 的实例，以引导和绑定服务器
            ServerBootstrap bootstrap = new ServerBootstrap();

            bootstrap.group(group) //
                    .channel(NioServerSocketChannel.class) //
                    // 3. 指定服务器绑定的本地的 InetSocketAddress
                    .localAddress(new InetSocketAddress(port))
                    // 4. 使用一个 EchoServerHandler 的实例初始化每一个新的 Channel
                    .childHandler(new ChannelInitializer() {
                        @Override
                        protected void initChannel(Channel ch) throws Exception {
                            ch.pipeline().addLast(serverHandler);
                        }
                    });

            // 5. 调用 ServerBootstrap.bind() 方法以绑定服务器
            ChannelFuture channelFuture = bootstrap.bind().sync();

            channelFuture.channel().closeFuture().sync();

            // sync() 方法的调用，将导致当前 Thread 阻塞，一直到 Future 操作完成为止。

        } finally {
            group.shutdownGracefully().sync();
        }

    }
}
