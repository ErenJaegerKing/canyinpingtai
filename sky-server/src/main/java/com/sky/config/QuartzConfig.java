//package com.sky.quartz;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class QuartzConfig {
//
//    @Bean("jobdetail1")
//    public JobDetail jobDetail1() {
//        return JobBuilder.newJob(Quartz1.class)
//                .withIdentity("DateTimeJob1")
//                .storeDurably()//即使没有Trigger关联时，也不需要删除该JobDetail
//                .build();
//    }
//
//    @Bean
//    public Trigger printTimeJobTrigger1() {
//        // 每秒执行一次
//        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/1 * * * * ?");
//        return TriggerBuilder.newTrigger()
//                .forJob(jobDetail1())
//                .withIdentity("quartzTaskService1")
//                .withSchedule(cronScheduleBuilder)
//                .build();
//    }
//
//    @Bean("jobdetail2")
//    public JobDetail jobDetail2() {
//        return JobBuilder.newJob(Quartz2.class)
//                .withIdentity("DateTimeJob2")
//                .storeDurably()//即使没有Trigger关联时，也不需要删除该JobDetail
//                .build();
//    }
//
//    @Bean
//    public Trigger printTimeJobTrigger2() {
//        // 每秒执行一次
//        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/1 * * * * ?");
//        return TriggerBuilder.newTrigger()
//                .forJob(jobDetail2())
//                .withIdentity("quartzTaskService2")
//                .withSchedule(cronScheduleBuilder)
//                .build();
//    }
//
//}