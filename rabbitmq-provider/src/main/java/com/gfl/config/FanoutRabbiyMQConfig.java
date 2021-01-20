package com.gfl.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

//实现BeanPostProcessor类，使用Bean的生命周期函数
@Configuration
public class FanoutRabbiyMQConfig implements BeanPostProcessor {

    /**
     *  创建三个队列 ：fanout.A   fanout.B  fanout.C fanout.D
     *  将三个队列都绑定在交换机 fanoutExchange 上
     *  因为是扇型交换机, 路由键无需配置,配置也不起作用
     */

   /* //队列一
    @Bean
    public Queue queueA(){
        return new Queue("fanout.A");
    }

    //队列二
    @Bean
    public Queue queueB(){
        return new Queue("fanout.B");
    }

    //队列三
    @Bean
    public Queue queueC(){
        return new Queue("fanout.C");
    }

    //队列四
    @Bean
    public Queue queueD(){
        return new Queue("fanout.D");
    }

    //创建交换机(扇形交换机)
    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    Binding bindingExchangeA(){
        return BindingBuilder.bind(queueA()).to(fanoutExchange());
    }

    @Bean
    Binding bindingExchangeB(){
        return BindingBuilder.bind(queueB()).to(fanoutExchange());
    }

    @Bean
    Binding bindingExchangeC(){
        return BindingBuilder.bind(queueC()).to(fanoutExchange());
    }

    @Bean
    Binding bindingExchangeD(){
        return BindingBuilder.bind(queueD()).to(fanoutExchange());
    }


    //这是创建交换机和队列用的rabbitAdmin对象
    @Resource
    private RabbitAdmin rabbitAdmin;

    //初始化rabbitAdmin对象
    @Bean
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
        RabbitAdmin rabbitAdmin = new RabbitAdmin(connectionFactory);
        // 只有设置为 true，spring 才会加载 RabbitAdmin 这个类
        rabbitAdmin.setAutoStartup(true);
        return rabbitAdmin;
    }

    //实例化bean后，也就是Bean的后置处理器
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //创建交换机
        rabbitAdmin.declareExchange(fanoutExchange());
        //创建队列
        rabbitAdmin.declareQueue(queueD());
        return null;
    }*/

}
