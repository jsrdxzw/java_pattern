package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-14
 */
public class CommandTest {

    public static void main(String[] args) {
        ConfigSettingWindow configSettingWindow = new ConfigSettingWindow();
        ConfigOperator configOperator = new ConfigOperator();
        Command command = new InsertCommand("增加");

        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("网站首页");

        command = new ModifyCommand("修改");
        command.setConfigOperator(configOperator);
        configSettingWindow.setCommand(command);
        configSettingWindow.call("网站首页");

        configSettingWindow.save();

        configSettingWindow.recover();
    }

}
