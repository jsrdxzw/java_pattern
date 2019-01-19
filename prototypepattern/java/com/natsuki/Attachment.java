package com.natsuki;

import java.text.MessageFormat;

/**
 * @author xuzhiwei
 * created at 2018-11-29
 */
public class Attachment implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void download(){
        System.out.println(MessageFormat.format("下载附件，文件名为：{0}",this.name));
    }


    @Override
    public Attachment clone() {
        Attachment attachment = null;
        try {
            attachment = (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return attachment;
    }
}
