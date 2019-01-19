package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-24
 */
public class AndroidSystemFactory implements OperationGameFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
