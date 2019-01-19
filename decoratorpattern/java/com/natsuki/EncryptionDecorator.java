package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-01
 */
public class EncryptionDecorator extends AbstractEncryption{
    private AbstractEncryption abstractEncryption;

    public EncryptionDecorator(AbstractEncryption abstractEncryption) {
        this.abstractEncryption = abstractEncryption;
    }

    @Override
    protected void encrypt() {
        abstractEncryption.encrypt();
    }
}
