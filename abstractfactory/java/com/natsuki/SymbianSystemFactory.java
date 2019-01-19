package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-24
 */
public class SymbianSystemFactory implements OperationGameFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new SymbianInterfaceController();
    }
}
