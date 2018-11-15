package com.trevorpc.week1daily3_translations;

public class Person extends Animal
{
    boolean soul;
    String name;


    public boolean isSoul() {
        return soul;
    }

    public void setSoul(boolean soul) {
        this.soul = soul;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person (int age,boolean hungry, boolean soul,String name)
    {
        this.age=age;
        this.hungry=hungry;
        this.soul=soul;
        this.name=name;
    }
}
