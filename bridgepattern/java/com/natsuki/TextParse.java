package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-09
 */
public abstract class TextParse {

    protected ReadDataBase readDataBase;

    public void setReadDataBase(ReadDataBase readDataBase) {
        this.readDataBase = readDataBase;
    }

    public abstract void parseData();
}
