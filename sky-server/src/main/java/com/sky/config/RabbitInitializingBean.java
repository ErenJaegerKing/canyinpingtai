//package com.sky.mqconfig;
//
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RabbitInitializingBean implements InitializingBean {
//
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        rabbitTemplate.setReturnCallback(new ReturnCallBack());
//    }
//}
