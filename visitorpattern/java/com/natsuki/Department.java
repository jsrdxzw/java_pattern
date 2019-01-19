package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-15
 */
public abstract class Department {
    public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}
