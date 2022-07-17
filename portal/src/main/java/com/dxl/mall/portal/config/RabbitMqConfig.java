package com.dxl.mall.portal.config;

import com.dxl.mall.portal.domain.QueueEnum;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * 消息队列相关配置
 */
@Configuration
public class RabbitMqConfig {



    /**
     * 订单延迟队列队列所绑定的交换机
     */
    @Bean
    CustomExchange orderTtlDirect() {
/*        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange())
                .durable(true)
                .build();*/

        Map<String,Object> args = new HashMap<>();
        args.put("x-delayed-type","direct");

        return new CustomExchange(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange(),"x-delayed-message",true,false,args);

    }



    /**
     * 订单延迟队列（死信队列）
     */
    @Bean
    public Queue orderTtlQueue() {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getName())
                .build();
    }


    /**
     * 将订单延迟队列绑定到交换机
     */
    @Bean
    Binding orderTtlBinding(CustomExchange orderTtlDirect,Queue orderTtlQueue){
        return BindingBuilder
                .bind(orderTtlQueue)
                .to(orderTtlDirect)
                .with(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getRouteKey()).noargs();
    }

}
