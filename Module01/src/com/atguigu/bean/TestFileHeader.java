package com.atguigu.bean;

import java.util.ArrayList;

/**
 * @author ErMu_QL
 * content：模板template
 * @create 2020/10/25-17:13
 */
public class TestFileHeader {


        //prsf 增加private static final
        private static final Customer cust=new Customer();
        //psf :public static final
        //psfi :public static final int
        //psfs :public static final String

    public static void main(String[] args) {

        //sout
        System.out.println("soutTest");
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("TestFileHeader.main");
        //soutv就近输出
        int num1=1;
        int num2=2;
        System.out.println("num2 = " + num2);
        //xxx.sout eg.num1.sout
        System.out.println(num1);

        //fori
        String[] arr=new String[]{"ar1","ar2","ar3"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //拓展1：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //拓展1：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        //list.for集合遍历
            ArrayList list =new ArrayList();
            list.add(111);
            list.add(222);
            list.add(333);

            for (int i1 = 0; i1 < list.size(); i1++) {
                System.out.println(list.get(i1));
            }
            for (int i1 = list.size() - 1; i1 >= 0; i1--) {

            }

            //ifn判断为空
            if (list == null) {

            }
            //inn判断不为空
            ArrayList list2 =new ArrayList();
            list2.add(111);
            if (list2 != null) {

            }
        }
    }
}
