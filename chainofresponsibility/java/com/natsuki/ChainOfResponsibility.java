package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-15
 */
public class ChainOfResponsibility {
    public static void main(String[] args) {
        Approver approver1,approver2,approver3,meeting;
        approver1 = new Director("张无忌");
        approver2 = new VicePresident("杨英");
        approver3 = new President("许志伟");
        meeting = new Congress("董事会");

        approver1.setSuccessor(approver2);
        approver2.setSuccessor(approver3);
        approver3.setSuccessor(meeting);

        PurchaseRequest purchaseRequest = new PurchaseRequest(530000,10001,"购买沙发");
        approver1.processRequest(purchaseRequest);
    }
}
