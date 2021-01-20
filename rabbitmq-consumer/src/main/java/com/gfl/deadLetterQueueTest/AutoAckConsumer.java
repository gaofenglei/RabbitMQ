package com.gfl.deadLetterQueueTest;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class AutoAckConsumer {

    /*
    消费者设置了自动签收，当重复投递次数达到了设置的最大retry次数之后，消息也会投递到死信队列，但是内部的原理还是调用了nack/reject。
    * */

    /**
     * 正常用户队列消息监听消费者
     *
     * @param
     */
    /*@RabbitListener(queues = "${app.rabbitmq.queue.user}")
    public void userConsumer(Map map) {
        System.out.println("正常用户业务监听：接收到消息:"+map.toString());
        throw new RuntimeException("模拟发生异常");
    }

    *//**
     * @param
     *//*
    @RabbitListener(queues = "${app.rabbitmq.queue.user-dead-letter}")
    public void userDeadLetterConsumer(Map map) {
        System.out.println("接收到死信消息并自动签收:"+map.toString());
    }*/

}