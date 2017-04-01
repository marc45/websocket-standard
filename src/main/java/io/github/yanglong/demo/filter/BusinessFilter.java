package io.github.yanglong.demo.filter;

import io.github.yanglong.demo.protocol.Message;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;

/**
 * package: io.github.yanglong.demo.filter <br/>
 * functional describe:process business
 *
 * @author DR.YangLong [410357434@163.com]
 * @version 1.0    2017/3/29
 */
public interface BusinessFilter {
    void doBusinessFilter(Message message, WebSocketSession session,BusinessFilterChain chain) throws IOException;
}
