package com.natsuki;

import java.lang.reflect.InvocationTargetException;

/**
 * @author xuzhiwei
 * created at 2018/11/21
 */
public class GeoMetryToolFactory {
    public static GeometryTool getGeometryTool(Class c){
        try {
            return (GeometryTool) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
