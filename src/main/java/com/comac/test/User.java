package com.comac.test;

public class User {

    private Long id;
    private String name;
    private  Integer age;
    private String ecode;
    private String ename;

    public User(String ecode, String ename) {
        this.ecode = ecode;
        this.ename = ename;
    }

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    private String AdminLevel;

    public User(String a, int i) {
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() {
    }

    public User(Long id, String name, Integer age, String adminLevel) {
        this.id = id;
        this.name = name;
        this.age = age;
        AdminLevel = adminLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", AdminLevel='" + AdminLevel + '\'' +
                '}';
    }

    public String getAdminLevel() {
        return AdminLevel;
    }

    public void setAdminLevel(String adminLevel) {
        AdminLevel = adminLevel;
    }
}
