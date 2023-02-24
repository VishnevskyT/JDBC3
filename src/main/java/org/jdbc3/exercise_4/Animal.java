package org.jdbc3.exercise_4;

//Задание 4


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {

    @Id
    private long id;
    private String name;
    private int age;
    private boolean tail;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
