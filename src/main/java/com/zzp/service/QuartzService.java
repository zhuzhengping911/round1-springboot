package com.zzp.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by zhuzhengping
 * on 2017/7/30.
 */
@Component
public class QuartzService {

//    每分钟启动
    @Scheduled(cron = "0 0/1 * * * ?")
    public void timerToNow(){

        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

    }
//    项目运行后的每5秒一次
    @Scheduled(fixedRate = 5000)
    public void timerToZZP(){

        System.out.println("ZZP:" + new Random().nextLong() + new SimpleDateFormat("HH:mm:ss").format(new Date()));

    }
//    项目启动后每50秒启动
    @Scheduled(fixedDelay = 50000)
    public void timerToReportCount(){
        for (int i = 0; i < 10; i++){

            System.out.println("<================its" + i + "count===============>" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }
    }
//    第一次启动在项目启动后延迟50秒开始，之后每6秒执行一次
    @Scheduled(initialDelay = 50000,fixedRate = 6000)
    public void timerToReport(){
        for (int i = 0; i < 10; i++){

            System.out.println("<================delay :" + i + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "count===============>");

        }
    }

    public static void main(String[] args) {

        System.out.println(Math.round(1.5));

        System.out.println(Math.round(-11.5));
        float f = 3.4f;
        System.out.println(f);

    }
}
