package com.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author:熊志阳
 * @date:2020/7/30
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Content implements Serializable {
    private static final long serialVersionUID = -4726638349019179485L;
    private int id;
    private ContentCategory contentCategory;
    private String title;
    private String url;
    private String pic;
    private String status;
    private int sort_order;
    private int del;
}
