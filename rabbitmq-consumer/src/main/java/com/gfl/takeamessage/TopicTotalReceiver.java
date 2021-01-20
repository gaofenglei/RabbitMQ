package com.gfl.takeamessage;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Component
//@RabbitListener(queues = "topic.woman")//监听的队列名称 TestDirectQueue
public class TopicTotalReceiver {

    //@RabbitHandler
    //public void process(Map testMessage) {
        //System.out.println("TopicTotalReceiver消费者收到消息  : " + testMessage.toString());
    //}

}
