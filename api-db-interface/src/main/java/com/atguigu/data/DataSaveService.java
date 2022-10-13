package com.atguigu.data;


import com.atguigu.data.data.DataSaveService1;

/**
 * 数据保存服务
 * Dubbo、Tomcat+SpringMVC
 */
public interface DataSaveService extends DataSaveService1 {

    void saveData(String data);


}
