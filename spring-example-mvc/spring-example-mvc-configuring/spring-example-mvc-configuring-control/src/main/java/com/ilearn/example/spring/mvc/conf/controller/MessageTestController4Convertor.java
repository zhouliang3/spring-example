package com.ilearn.example.spring.mvc.conf.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能说明:
 *
 * @author zhouliang
 * @Date 2016-12-29
 * <p/>
 * <p/>
 * 版本号 | 作者 | 修改时间 | 修改内容
 */
@RestController
@RequestMapping("/api/v1/msg")
public class MessageTestController4Convertor {
    public static final String YYYYMMDD = "yyyy-MM-dd";
    public static final String YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

    @RequestMapping(value = "/f/{date}", method = RequestMethod.GET)
    public void convertDateByFormatter(@DateTimeFormat(pattern = YYYYMMDDHHMMSS) @PathVariable Date date) {
        SimpleDateFormat format = new SimpleDateFormat(YYYYMMDDHHMMSS);
        System.out.println("date is :" + format.format(date));
    }

    /**
     * 需要在配置文件中加入converter的配置，将string类型转换为Date类型才能访问此方法
     *
     * @param date
     */
    @RequestMapping(value = "/c/{date}", method = RequestMethod.GET)
    public void convertDateByConvertor(@PathVariable Date date) {
        SimpleDateFormat format = new SimpleDateFormat(YYYYMMDD);
        System.out.println("date is :" + format.format(date));
    }


}
