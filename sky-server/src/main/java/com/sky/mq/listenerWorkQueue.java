//package com.sky.mq;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalTime;
//
////@Component
//public class listenerWorkQueue {
//
//    @RabbitListener(queues = "simple.queue")
//    public void listenWorkQueue1(String msg) throws InterruptedException {
//        System.out.println("消费者1接收到消息：【" + msg + "】" + LocalTime.now());
//        Thread.sleep(20);
//    }
//
//    @RabbitListener(queues = "simple.queue")
//    public void listenWorkQueue2(String msg) throws InterruptedException {
//        System.err.println("消费者2........接收到消息：【" + msg + "】" + LocalTime.now());
//        Thread.sleep(200);
//    }
//
//}
