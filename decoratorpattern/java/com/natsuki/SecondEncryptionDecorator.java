package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-01
 */
public class SecondEncryptionDecorator extends EncryptionDecorator{

    public SecondEncryptionDecorator(AbstractEncryption abstractEncryption) {
        super(abstractEncryption);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        System.out.println("开始进行反向加密");
    }
}
