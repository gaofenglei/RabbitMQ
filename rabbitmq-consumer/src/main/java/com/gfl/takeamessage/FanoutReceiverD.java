package com.gfl.takeamessage;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Component
//使用queuesToDeclare属性，如果不存在则会创建队列
//@RabbitListener(queuesToDeclare = @Queue("fanout.D"))
public class FanoutReceiverD {

    //@RabbitHandler
    //public void process(Map testMessage){
    //    System.out.println("FanoutReceiverD消费者收到消息  : " +testMessage.toString());
    //}

}
