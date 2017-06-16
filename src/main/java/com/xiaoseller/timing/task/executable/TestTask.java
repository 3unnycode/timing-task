/**
 * 
 */
package com.xiaoseller.timing.task.executable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {
	
	private static final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
    @Scheduled(cron = "0/3 * * * * *")
    public void reportCurrentTime2() {
        System.out.println("任务2," + Thread.currentThread() + "|" + format.format(new Date()));
    }
}
