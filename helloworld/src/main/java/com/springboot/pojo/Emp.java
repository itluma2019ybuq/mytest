package com.springboot.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author 飞鸟
 * @create 2020-01-09 10:36
 */
@Data
public class Emp {
    private Integer UUID;
    private String USERNAME;
    private String PWD;
    private String NAME;
    private int GENDER;
    private String EMAIL;
    private String TELE;
    private String ADDRESS;
    private Date BIRTHDAY;
    private int DEPUUID;

}
