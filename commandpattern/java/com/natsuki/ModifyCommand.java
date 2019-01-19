package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-14
 */
public class ModifyCommand extends Command {

    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        configOperator.modify(this.args);
    }
}
