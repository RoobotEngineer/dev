package com.comac.test;

public enum  AdminLevel {
    ADMIN_LEVEL(3,"3");
    private String key;
    private Integer value;

    AdminLevel(Integer value,String key) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
