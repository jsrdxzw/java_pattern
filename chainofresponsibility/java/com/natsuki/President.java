package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-15
 */
public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount()<500000){
            System.out.println("董事长"+this.name+"审批采购单:"+request);
        } else {
            this.successor.processRequest(request);
        }
    }
}
