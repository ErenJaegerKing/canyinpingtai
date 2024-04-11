package com.sky.mqconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReturnCallBack implements RabbitTemplate.ReturnsCallback {

    @Override
    public void returnedMessage(ReturnedMessage returnedMessage) {
        log.info("returnMessage ===> ",returnedMessage.getMessage(),returnedMessage.getExchange());
    }
}
