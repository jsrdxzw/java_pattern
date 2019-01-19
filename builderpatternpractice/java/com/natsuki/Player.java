package com.natsuki;

import java.util.Arrays;

/**
 * @author xuzhiwei
 * created at 2018-11-25
 */
public class Player {
    private String menu;
    private String[] playList;
    private String window;
    private String controller;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String[] getPlayList() {
        return playList;
    }

    public void setPlayList(String[] playList) {
        this.playList = playList;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    @Override
    public String toString() {
        return "Player{" +
                "menu='" + menu + '\'' +
                ", playList=" + Arrays.toString(playList) +
                ", window='" + window + '\'' +
                ", controller='" + controller + '\'' +
                '}';
    }
}
