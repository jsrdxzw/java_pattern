package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-15
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会");
    }
}
