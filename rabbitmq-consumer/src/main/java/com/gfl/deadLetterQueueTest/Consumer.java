package com.gfl.deadLetterQueueTest;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
public class Consumer {

    /*
    消息被(basic.reject() or basic.nack()) and requeue = false，即消息被消费者拒绝或者nack，并且重新入队为false。
    */

    /*@RabbitListener(queues = "${app.rabbitmq.queue.user}")
    public void userConsumer(Map<String,String> map, Message message, Channel channel){
        System.out.println("正常用户业务监听：接收到消息:[{}]"+map.toString());
        try {
            //参数为：消息的DeliveryTag(唯一id)，是否批量拒绝，是否重新入队
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
            System.out.println("拒绝签收...消息的路由键为:[{}]"+message.getMessageProperties().getReceivedRoutingKey());
        } catch (IOException e) {
            System.out.println("消息拒绝签收失败"+e);
        }
    }

    @RabbitListener(queues = "${app.rabbitmq.queue.user-dead-letter}")
    public void userDeadLetterConsumer(Map<String,String> map, Message message, Channel channel) {
        System.out.println("接收到死信消息:[{}]"+map.toString());
        try {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            System.out.println("死信队列签收消息....消息路由键为:[{}]"+message.getMessageProperties().getReceivedRoutingKey());
        } catch (IOException e) {
            System.out.println("死信队列消息签收失败"+ e.toString());
        }
    }*/

}
