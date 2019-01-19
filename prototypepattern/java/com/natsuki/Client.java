package com.natsuki;

import java.util.Date;

/**
 * @author xuzhiwei
 * created at 2018-11-29
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous = new WeeklyLog();

        Attachment attachment = new Attachment();
        attachment.setName("AV.jpg");
        log_previous.setName("张无忌");
        log_previous.setContent("每天加班");
        log_previous.setDate("第12周");
        log_previous.setAttachment(attachment);
        log_previous.setBirthday(new Date());



        WeeklyLog log_new = log_previous.clone();
        log_new.setDate("第13周");
        log_new.getBirthday().setTime(99999999L);
        System.out.println(log_previous);
        System.out.println(log_new);

    }
}
