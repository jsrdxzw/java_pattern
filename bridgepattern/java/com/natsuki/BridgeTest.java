package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-09
 */
public class BridgeTest {
    public static void main(String[] args) {
        ReadDataBase readDataBase = new ReadMysqlDataBase();
        TextParse textParse = new TextParse2Txt();
        textParse.setReadDataBase(readDataBase);
        textParse.parseData();
    }
}
