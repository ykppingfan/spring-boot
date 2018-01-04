package com.loadclass.demo;

import java.util.Date;

/**
 * @Author: yangkunpeng
 * @Date 2018/1/3
 */
public class ClassLoaderAttachment extends Date {

    private static final long serialVersionUID = 8627644427315706176L;
    //打印数据
    @Override
    public String toString(){
        return "Hello ClassLoader!";
    }

}
