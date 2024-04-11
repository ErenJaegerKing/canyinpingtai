package com.sky.mqconfig;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    private static String EXCHANGE_NAME = "amq.topic";
    private static String QUEUE_NAME = "alarm.data.topic.queue";
    private static String CONFIRM_ALARM_QUEUE_NAME = "alarm.confirm.data.topic.queue";

    /**
     * 声明交换机
     */

    @Bean
    public TopicExchange exchange() {
        // durable:是否持久化,默认是false
        // autoDelete:是否自动删除，当没有生产者或者消费者使用此交换机，该交换机会自动删除。
        return new TopicExchange(EXCHANGE_NAME, true, false);
    }

    /**
     * 声明告警队列
     *
     * @return
     */
    @Bean("alarmQueue")
    public Queue alarmQueue() {
        // durable:是否持久化,默认是false,持久化队列：会被存储在磁盘上，当消息代理重启时仍然存在
        // exclusive:默认也是false，只能被当前创建的连接使用，而且当连接关闭后队列即被删除。此参考优先级高于durable
        // autoDelete:是否自动删除，当没有生产者或者消费者使用此队列，该队列会自动删除。
        return new Queue(QUEUE_NAME, true, false, false);
    }

    /**
     * 声明确认告警队列
     *
     * @return
     */
    @Bean("confirmAlarmQueue")
    public Queue confirmAlarmQueue() {
        return new Queue(CONFIRM_ALARM_QUEUE_NAME, true, false, false);
    }

    /**
     * 声明告警队列绑定关系
     *
     * @param queue
     * @param topicExchange
     * @return
     */
    @Bean
    public Binding alarmBinding(@Qualifier("alarmQueue") Queue queue, TopicExchange topicExchange) {
        return BindingBuilder.bind(queue).to(topicExchange).with("server.event.#");
    }

    /**
     * 声明确认告警队列绑定关系
     *
     * @param queue
     * @param topicExchange
     * @return
     */
    @Bean
    public Binding confirmAlarmBinding(@Qualifier("confirmAlarmQueue") Queue queue, TopicExchange topicExchange) {
        return BindingBuilder.bind(queue).to(topicExchange).with("server.event_confirm.#");
    }
}