package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-25
 */
public abstract class PlayerBuilder {

    protected Player player = new Player();

    abstract void setMenu();
    abstract void setPlayList();
    abstract void setWindow();
    abstract void setController();

    public Player constract(){
        this.setMenu();
        this.setPlayList();
        this.setWindow();
        this.setController();
        return this.player;
    }
}
