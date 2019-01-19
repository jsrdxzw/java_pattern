package com.natsuki;


/**
 * @author xuzhiwei
 * created at 2018-12-15
 */
public class VicePresident extends Approver {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount()<100000){
            System.out.println("副董事长"+this.name+"审批采购单:"+request);
        } else {
            this.successor.processRequest(request);
        }
    }
}
