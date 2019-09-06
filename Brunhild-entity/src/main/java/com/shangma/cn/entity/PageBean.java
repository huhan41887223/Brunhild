package com.shangma.cn.entity;

import java.util.List;

/**
 * @program: pikachu
 * @description: 用途，
 * @author: 作者
 * @create: 2019/8/273:59
 **/
public class PageBean<T> {


    private Long total;
    private List<T> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
