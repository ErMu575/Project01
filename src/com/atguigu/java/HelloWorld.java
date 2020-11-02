package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

public class HelloWorld {
    //prsf 增加private static final
    //Customer报错：alt+enter提示，点击添加module模块的依赖
    private static final Customer cust=new Customer();

    public static  void main(String[] args){
        System.out.println("Hello World !");

//        Array array =new Array();

        ArrayList arrayList = new ArrayList();

    }

    public void method(){
//这是单行注释
    }
}
