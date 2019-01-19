package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-25
 */
public class WholePlayerBuilder extends PlayerBuilder {
    @Override
    void setMenu() {
        this.player.setMenu("设置菜单");
    }

    @Override
    void setPlayList() {
        String[] playList = {"ok","hello"};
        this.player.setPlayList(playList);
    }

    @Override
    void setWindow() {
        this.player.setWindow("window");
    }

    @Override
    void setController() {
        this.player.setController("controller");
    }
}
