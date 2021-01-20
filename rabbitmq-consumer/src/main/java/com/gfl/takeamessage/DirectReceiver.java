package com.gfl.takeamessage;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Queue;

import java.util.Map;

//@Component
//@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiver {

    //@RabbitHandler
    //public void process(Map testMessage) {
    //  System.out.println("DirectReceiver消费者收到消息一  : " + testMessage.toString());
    //}

}
