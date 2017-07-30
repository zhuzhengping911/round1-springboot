package com.zzp.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by zhuzhengping on 2017/7/30.
 */
@Component
public class QuartzService {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void timerToNow(){
        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Scheduled(fixedRate = 5000)
    public void timerToZZP(){
        System.out.println("ZZP:" + new Random().longs());
    }

    @Scheduled(fixedDelay = 5000)
    public void timerToReportCount(){
        for (int i = 0; i < 10000; i++){
            System.out.println("<================its" + i + "count===============>");
        }
    }

    @Scheduled(fixedDelay = 5000)
    public void timerToReportCount(){
        for (int i = 0; i < 10000; i++){
            System.out.println("<================its" + i + "count===============>");
        }
    }
}
