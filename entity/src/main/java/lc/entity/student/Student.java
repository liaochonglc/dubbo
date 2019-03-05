package lc.entity.student;

import java.io.Serializable;

public class Student implements Serializable {
    public String name;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}
