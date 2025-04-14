package com.shmormius.entity;

public class StandUser extends GameEntity{
    private String standName;
    private String ability;

    public StandUser(){
        super();
        standName = "No Name";
        ability = "No Special Ability";
    }

    public String getStandName(){
        return standName;
    }

    public String getStandAbility(){
        return ability;
    }
}
