package com.natsuki;

import java.io.*;
import java.util.List;

/**
 * @author xuzhiwei
 * created at 2018-12-14
 */
public class FileUtil {

    public static void writeCommands(List commands){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("config.log");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(commands);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("命令保存失败");
            e.printStackTrace();
        }
    }

    public static List readCommands(){
        try {
            FileInputStream fileInputStream = new FileInputStream("config.log");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            List commands = (List) inputStream.readObject();
            inputStream.close();
            return commands;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("命令失败");
            e.printStackTrace();
        }
        return null;
    }
}

