package com.pblgllgs.restapi.versioning;

public class PersonV1 {

    private String name;

    public String PersonV1(String name) {
        return name;
    }

    public PersonV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "name='" + name + '\'' +
                '}';
    }
}
