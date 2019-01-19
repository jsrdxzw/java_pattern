package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-14
 */
public class MementoTest {
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Chessman chessman = new Chessman("车",1,1);
        mementoCaretaker.setMemento(chessman.save());
        System.out.println(chessman);
        chessman.setY(4);
        mementoCaretaker.setMemento(chessman.save());
        System.out.println(chessman);
        chessman.setX(5);
        mementoCaretaker.setMemento(chessman.save());
        System.out.println(chessman);

        chessman.restore(mementoCaretaker.goBack());
        chessman.restore(mementoCaretaker.goBack());
        chessman.restore(mementoCaretaker.goBack());
        System.out.println(chessman);
    }
}
