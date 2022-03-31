package com.ssm.po;

public class Banji {
    private Integer banji_id;
    private String banji_name;

    public Integer getBanji_id() {
        return banji_id;
    }

    public void setBanji_id(Integer banji_id) {
        this.banji_id = banji_id;
    }

    public String getBanji_name() {
        return banji_name;
    }

    public void setBanji_name(String banji_name) {
        this.banji_name = banji_name;
    }

    @Override
    public String toString() {
        return "Banji{" +
                "banji_id=" + banji_id +
                ", banji_name='" + banji_name + '\'' +
                '}';
    }
}
