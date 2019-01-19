package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-25
 */
public class Actor {
    private String type;
    private String gender;
    private String face;
    private String costume;
    private String hairstyle;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", face='" + face + '\'' +
                ", costume='" + costume + '\'' +
                ", hairstyle='" + hairstyle + '\'' +
                '}';
    }
}
