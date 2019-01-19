package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-24
 */
public class SymbianOperationController implements OperationController {
    @Override
    public void move() {
        System.out.println("塞班系统 move");
    }

    @Override
    public void attack() {
        System.out.println("塞班系统 攻击");
    }
}
