package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-29
 */
public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail Class Construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
