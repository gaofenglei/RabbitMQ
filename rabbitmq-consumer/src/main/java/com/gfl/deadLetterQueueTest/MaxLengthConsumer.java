package com.gfl.deadLetterQueueTest;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MaxLengthConsumer {

    /* 队列设置了x-max-length最大消息数量且当前队列中的消息已经达到了这个数量，再次投递，消息将被挤掉，被挤掉的是最靠近被消费那一端的消息。 */

    /**
     * 正常用户队列消息监听消费者
     *
     * @param
     */
 /*   @RabbitListener(queues = "${app.rabbitmq.queue.user}")
    public void userConsumer(Map map) {
        System.out.println("正常用户业务监听：接收到消息:"+map.toString());
    }*/

    @RabbitListener(queues = "${app.rabbitmq.queue.user-dead-letter}")
    public void userDeadLetterConsumer(Map map) {
        System.out.println("接收到死信消息并自动签收:"+map.toString());
    }


}
