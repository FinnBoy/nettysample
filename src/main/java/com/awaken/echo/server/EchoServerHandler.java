package com.awaken.echo.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

import java.util.Date;

/**
 * 标示一个Channel，Handler可以被多个Channel安全地共享
 */
@ChannelHandler.Sharable
public class EchoServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        ByteBuf in = (ByteBuf) msg;

        // 将消息记录到控制台
        System.out.println("receive data from client!");
        System.out.println(" ------- Server received: " + in.toString(CharsetUtil.UTF_8));
        System.out.println("biz logic!");
        System.out.println("send result to client!");

        // 将接收到的消息写给发送者，而不冲刷出站消息
        ctx.write(in);

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        // 将未决消息冲刷到远程节点，并且关闭该Channel
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {

        // 打印异常栈跟踪
        cause.printStackTrace();

        // 关闭该Channel
        ctx.close();

    }
}
