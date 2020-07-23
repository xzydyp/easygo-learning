package com.easygo.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * @author:熊志阳
 * @date:2020/7/21
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand implements Serializable {
    private static final long serialVersionUID = -1409791064720126655L;
    private int id;
    private String name;
    private String image;
    private String first_char;
    private int del;
}
