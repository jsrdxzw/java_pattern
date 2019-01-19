package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-15
 */
public class Teacher implements User {

    private String name;
    private int sci;
    private int score;

    public Teacher(String name, int sci, int score) {
        this.name = name;
        this.sci = sci;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void accept(RewardSystem rewardSystem) {
        rewardSystem.visit(this);
    }
}
