package com.sky.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class AlarmConsumer {

    @RabbitListener(queues ="alarm.data.topic.queue",concurrency = "5")
    public void getAlarmInfo(String data){
        System.out.println("告警消息" + data);
    }

    @RabbitListener(queues ="alarm.confirm.data.topic.queue",concurrency = "5")
    public void getConfirmAlarmInfo(String data){
        System.out.println("确认告警消息" + data);
    }
}