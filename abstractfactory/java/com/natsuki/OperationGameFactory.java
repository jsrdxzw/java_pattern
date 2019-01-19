package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-24
 */
public interface OperationGameFactory {
    OperationController createOperationController();
    InterfaceController createInterfaceController();
}
