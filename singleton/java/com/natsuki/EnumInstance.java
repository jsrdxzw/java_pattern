package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-27
 */
public enum  EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
