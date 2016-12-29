package cn.javass.chapter7.web.controller.validate.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class B {

    @NotNull
    @Length(min = 3, max = 10)
    private String b;

    public void setB(String b) {
        this.b = b;
    }

    public String getB() {
        return b;
    }
}
