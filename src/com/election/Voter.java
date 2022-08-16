package com.election;

public class Voter {
    private String name;
    private int age;
    static final int VOTER_ELIGIBLE_AGE = 18;

    public Voter(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    
}
