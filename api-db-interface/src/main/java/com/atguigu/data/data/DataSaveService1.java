package com.atguigu.data.data;


/**
 * 数据保存服务
 * Dubbo、Tomcat+SpringMVC
 */
public interface DataSaveService1  {

    default void saveData1(String data){
        System.out.println("123213213");
    };


}
