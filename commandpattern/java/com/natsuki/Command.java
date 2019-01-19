package com.natsuki;

import java.io.Serializable;

/**
 * @author xuzhiwei
 * created at 2018-12-14
 */
public abstract class Command implements Serializable {
    protected String name;
    protected String args;
    protected ConfigOperator configOperator;

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    public abstract void execute(String args);
    public abstract void execute();
}
