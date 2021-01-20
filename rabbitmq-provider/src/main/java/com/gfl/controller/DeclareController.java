package com.gfl.controller;

import org.apache.catalina.User;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class DeclareController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${app.rabbitmq.exchange.user}")
    private String userExchange;

    @RequestMapping("send")
    @ResponseBody
    public String send(String exp){
        Map<String,String> map=new HashMap<>();
        map.put("id",new Random().toString());
        map.put("name","wzx");
        map.put("age","18");
        map.put("status","success");
        System.out.println("消息投递......存活时间是:"+exp);
        rabbitTemplate.convertAndSend(userExchange, "user.abc", map, new MessagePostProcessor() {
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                MessageProperties messageProperties=new MessageProperties();
                //为每条消息设置过期时间
                messageProperties.setExpiration(exp);
                return message;
            }
        });
        return map.get("status");
    }
}
