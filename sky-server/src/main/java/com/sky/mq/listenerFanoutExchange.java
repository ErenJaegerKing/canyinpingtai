//package com.sky.mq;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
////@Component
//public class listenerFanoutExchange {
//
//    @RabbitListener(queues = "fanout.queue1")
//    public void listenFanoutQueue1(String msg) {
//        System.out.println("消费者1接收到Fanout消息：【" + msg + "】");
//    }
//
//    @RabbitListener(queues = "fanout.queue2")
//    public void listenFanoutQueue2(String msg) {
//        System.out.println("消费者2接收到Fanout消息：【" + msg + "】");
//    }
//}
