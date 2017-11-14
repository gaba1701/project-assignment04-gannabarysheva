package com.assignment_4.superclasses;
/**
 * represents an abstract human
 *  */

public class Human {
    /**
@param  name of the human
@param  humans age
     */
    private String name;
    private int age;
/**
 * take all the attributes
 * @param name of the human
 * @param age age of the human
 */

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}