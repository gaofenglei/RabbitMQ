package com.gfl.deadLetterQueueTest;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Configuration
@Component
public class OvertimeConsumer {

    /* 消息过期，过了TTL存活时间。 */

    /**
     * 正常用户队列消息监听消费者
     *
     * @param
     */
    /*@RabbitListener(queues = "${app.rabbitmq.queue.user}")
    public void userConsumer(Map map) {
        System.out.println("正常用户业务监听：接收到消息:"+map.toString());
        throw new RuntimeException("模拟发生异常");
    }*/

    /*@RabbitListener(queues = "${app.rabbitmq.queue.user-dead-letter}")
    public void userDeadLetterConsumer(Map map) {
        System.out.println("接收到死信消息并自动签收:"+map.toString());
    }*/

}
