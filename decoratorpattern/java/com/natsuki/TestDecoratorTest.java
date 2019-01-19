package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-01
 */
public class TestDecoratorTest {
    public static void main(String[] args) {
        AbstractEncryption simple = new Encryption();
        simple.encrypt();
        AbstractEncryption second = new Encryption();
        second = new SecondEncryptionDecorator(second);
        second.encrypt();
//        encryption = new ThirdEncryptionDecorator(encryption);
//        encryption.encrypt();
    }
}
