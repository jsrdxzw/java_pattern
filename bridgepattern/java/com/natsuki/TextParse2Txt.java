package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-09
 */
public class TextParse2Txt extends TextParse {

    @Override
    public void parseData() {
        String dataFromDataBase = this.readDataBase.getDataFromDataBase();
        System.out.println(dataFromDataBase);
        System.out.println("转化txt");
    }
}
