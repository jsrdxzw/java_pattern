package com.natsuki;

import java.util.Date;

/**
 * @author xuzhiwei
 * created at 2018-11-29
 */
public class WeeklyLog implements Cloneable {
    private String name;
    private String date;
    private String content;
    private Date birthday;
    private Attachment attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    public WeeklyLog clone(){
        WeeklyLog weeklyLog = null;
        try {
            weeklyLog = (WeeklyLog) super.clone();
            weeklyLog.attachment = attachment.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return weeklyLog;
    }

    @Override
    public String toString() {
        return "WeeklyLog{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", birthday=" + birthday +
                ", attachment=" + attachment +
                '}';
    }
}
