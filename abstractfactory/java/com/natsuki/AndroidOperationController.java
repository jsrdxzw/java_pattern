package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-24
 */
public class AndroidOperationController implements OperationController {
    @Override
    public void move() {
        System.out.println("Android move");
    }

    @Override
    public void attack() {
        System.out.println("Android attack");
    }
}
