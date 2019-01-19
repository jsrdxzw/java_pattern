package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-24
 */
public class Test {
    public static void main(String[] args) {
        OperationGameFactory factory = new AndroidSystemFactory();
        OperationController operationController = factory.createOperationController();
        operationController.move();
        operationController.attack();
        InterfaceController interfaceController = factory.createInterfaceController();
        interfaceController.displayMenu();
    }
}
