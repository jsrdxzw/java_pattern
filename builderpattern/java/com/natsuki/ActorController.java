package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-25
 */
public class ActorController {
    public Actor constructor(ActorBuilder actorBuilder){
        actorBuilder.buildCostume();
        actorBuilder.buildFace();
        actorBuilder.buildGender();
        actorBuilder.buildHairstyle();
        actorBuilder.buildType();
        return actorBuilder.createActor();
    }
}
