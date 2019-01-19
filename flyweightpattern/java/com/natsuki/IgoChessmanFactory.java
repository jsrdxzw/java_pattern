package com.natsuki;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuzhiwei
 * created at 2018-12-03
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory igoChessmanFactory = new IgoChessmanFactory();
    private static Map ht;

    private IgoChessmanFactory(){
        if (igoChessmanFactory!=null){
            throw new RuntimeException("不能通过反射新建单利对象");
        }
        ht = new HashMap();
        AbstractIgoChessman whiteIgoChessman = new WhiteIgoChessman();
        AbstractIgoChessman blackIgoChessman = new BlackIgoChessman();
        ht.put("b",blackIgoChessman);
        ht.put("w",whiteIgoChessman);
    }

    public static IgoChessmanFactory getInstance(){
        return igoChessmanFactory;
    }
    public static AbstractIgoChessman getIgoChessman(String color){
        return (AbstractIgoChessman) ht.get(color);
    }

}
