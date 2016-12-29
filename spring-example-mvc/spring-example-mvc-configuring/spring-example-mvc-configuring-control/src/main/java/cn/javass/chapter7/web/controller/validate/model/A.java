package cn.javass.chapter7.web.controller.validate.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class A {

    @NotNull
    @Length(min = 2, max = 10)
    private String a;

    public void setA(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }
}
