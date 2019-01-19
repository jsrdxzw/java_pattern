package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-01
 */
public class ThirdEncryptionDecorator extends EncryptionDecorator {

    public ThirdEncryptionDecorator(AbstractEncryption abstractEncryption) {
        super(abstractEncryption);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        System.out.println("最复杂的加密操作。。");
    }
}
