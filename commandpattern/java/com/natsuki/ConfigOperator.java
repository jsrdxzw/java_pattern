package com.natsuki;

import java.io.Serializable;

/**
 * @author xuzhiwei
 * created at 2018-12-14
 */
public class ConfigOperator implements Serializable {
    public void insert(String args) {
        System.out.println("增加新节点" + args);
    }

    public void modify(String args) {
        System.out.println("修改节点" + args);
    }

    public void delete(String args){
        System.out.println("删除节点" + args);
    }

}
