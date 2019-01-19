package com.natsuki;

import java.util.Stack;

/**
 * @author xuzhiwei
 * created at 2018-12-14
 */
public class MementoCaretaker {
    private Stack<ChessmanMemento> mementos = new Stack<>();

    public ChessmanMemento goBack(){
        if (mementos.size()>0){
            return mementos.pop();
        }
        return null;
    }

    public void setMemento(ChessmanMemento memento){
        mementos.push(memento);
    }
}
