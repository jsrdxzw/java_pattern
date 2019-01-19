package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-11-25
 */
public abstract class ActorBuilder {

    Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildGender();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    Actor createActor(){
        return this.actor;
    }

    public Actor constract(){
        this.buildType();
        this.buildHairstyle();
        this.buildFace();
        this.buildGender();
        this.buildCostume();
        return this.actor;
    }
}
