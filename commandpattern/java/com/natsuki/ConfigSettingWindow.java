package com.natsuki;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuzhiwei
 * created at 2018-12-14
 */
public class ConfigSettingWindow {
    private List<Command> commands = new ArrayList<>();

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(String args) {
        command.execute(args);
        commands.add(command);
    }

    public void save() {
        FileUtil.writeCommands(commands);
    }

    public void recover() {
        List list = FileUtil.readCommands();
        if (list != null) {
            for (Object o : list) {
                ((Command) o).execute();
            }
        }
    }
}
