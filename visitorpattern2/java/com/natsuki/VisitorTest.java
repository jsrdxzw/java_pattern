package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-15
 */
public class VisitorTest {
    public static void main(String[] args) {
        User user1 = new Student("赵敏",12,100);
        RewardSystem rewardSystem = new RewardSystem();
        user1.accept(rewardSystem);
    }
}
