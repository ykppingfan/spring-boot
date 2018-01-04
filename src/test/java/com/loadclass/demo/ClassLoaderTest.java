package com.loadclass.demo;

import java.util.Date;
import java.util.List;

/**
 * @Author: yangkunpeng
 * @Date 2018/1/3
 */
public class ClassLoaderTest {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args){
//        //输出ClassLoaderText的类加载器名称
//        System.out.println("ClassLoaderTest类的加载器的名称:"+ClassLoaderTest.class.getClassLoader().getClass().getName());
//        System.out.println("System类的加载器的名称:"+System.class.getClassLoader());
//        System.out.println("List类的加载器的名称:"+List.class.getClassLoader());
//
//        System.out.println("默认的类加载器:"+ClassLoaderTest.class.getClassLoader().getSystemClassLoader());
//
//        ClassLoader cl = ClassLoaderTest.class.getClassLoader();
//        while(cl != null){
//            System.out.print(cl.getClass().getName()+"->");
//            cl = cl.getParent();
//        }
//        System.out.println(cl);

        try {
            Class classDate = new MyClassLoader("E:\\ykpworkspace\\Algorithm\\src\\com\\loadclass\\demo").loadClass("ClassLoaderAttachment");
            Date date = (Date) classDate.newInstance();
            //输出ClassLoaderAttachment类的加载器名称
            System.out.println("ClassLoader:"+date.getClass().getClassLoader().getClass().getName());
            System.out.println(date);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
