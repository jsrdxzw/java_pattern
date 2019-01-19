package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-25
 */
public  class TestBuilderParctice  {
    public static void main(String[] args) {
        PlayerBuilder playerBuilder = new WholePlayerBuilder();
        Player player = playerBuilder.constract();
        System.out.println(player);
    }
}
