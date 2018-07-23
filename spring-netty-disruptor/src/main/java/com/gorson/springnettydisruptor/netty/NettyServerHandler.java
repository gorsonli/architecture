package com.gorson.springnettydisruptor.netty;

import com.gorson.springnettydisruptor.dto.GorsonDTO;
import com.gorson.springnettydisruptor.service.DisruptorService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import static io.netty.handler.codec.rtsp.RtspResponseStatuses.OK;
import static org.springframework.http.HttpHeaders.CONTENT_LENGTH;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

/**
 * 此类的描述是：
 *
 * @create 2018-04-01 19:07
 **/
public class NettyServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> {
    private static final Logger LOGGER = LoggerFactory.getLogger(NettyServerHandler.class);

    private DisruptorService disruptorService;

    public NettyServerHandler(DisruptorService disruptorService) {
        this.disruptorService = disruptorService;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, FullHttpRequest fullHttpRequest) {
        String url = fullHttpRequest.uri();
        HttpMethod method = fullHttpRequest.method();

        if ("post".equalsIgnoreCase(method.name())) {

        } else if ("get".equalsIgnoreCase(method.name())){

        } else {
            LOGGER.info("NettyServerHandler method return: " + method.name());
        }

//        System.out.println("NettyServerHandler url and method: " + url + " " + method);

        ByteBuf buf = fullHttpRequest.content();
        byte[] bytes = new byte[buf.readableBytes()];
        buf.readBytes(bytes);
//        System.out.println("接收到数据：" + new String(bytes));

        save(new String(bytes));
        FullHttpResponse response = generateResponse("ok");
        channelHandlerContext.writeAndFlush(response);
    }

    public void save(String dataString) {
//       System.out.println(dataString);

        disruptorService.getGorsonEventProducer().onData(new GorsonDTO() {{
            setId(1);
            setName(dataString);
        }});
    }

    private FullHttpResponse generateResponse(String content) {
        FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.wrappedBuffer(content.getBytes()));
        response.headers().set(CONTENT_TYPE, "text/plain");
        response.headers().set(CONTENT_LENGTH, response.content().readableBytes());
//        response.headers().set(CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        return response;
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        LOGGER.error(cause.getMessage());
        ctx.close();
    }
}
