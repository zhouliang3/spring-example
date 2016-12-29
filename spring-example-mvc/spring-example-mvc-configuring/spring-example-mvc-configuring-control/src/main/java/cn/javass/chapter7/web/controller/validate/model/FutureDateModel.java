package cn.javass.chapter7.web.controller.validate.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import java.util.Date;

public class FutureDateModel {

    //验证注解的元素值（日期类型）比当前时间晚
    @Future
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
