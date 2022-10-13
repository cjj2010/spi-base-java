package com.atguigu.mysql;

import com.atguigu.data.DataSaveService;

public class MySQLSaveService implements DataSaveService
{
//    @Override
//    public void saveData1(String data) {
//        System.out.println("MySQL保存了数据1......."+data);
//    }

    @Override
    public void saveData(String data) {
        System.out.println("MySQL保存了数据......."+data);
    }
}
