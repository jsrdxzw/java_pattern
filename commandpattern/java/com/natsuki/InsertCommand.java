package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-14
 */
public class InsertCommand extends Command {

    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }

    @Override
    public void execute() {
        configOperator.insert(this.args);
    }
}
