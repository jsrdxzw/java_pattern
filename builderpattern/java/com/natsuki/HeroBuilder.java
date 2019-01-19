package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-25
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildGender() {
        actor.setGender("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
