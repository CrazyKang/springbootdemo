package com.boottest.util;

/**
 * @Author: wangk
 * @discription:TODO
 * @Date: 2019/6/27 16:56
 */
public class TestUtil {



    //try-with-resource，jdk1.7之后的语法
    public static void main(String[] args) {
        tt();
    }


    public static void tt() {

        try (C1 c1 = new C1()) {
            c1.say();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }


    public static class C1 implements AutoCloseable {

        public void say() {
            System.out.println("say");
            int i=1/0;
        }


        @Override
        public void close() throws Exception {

            System.out.println("close");
        }
    }




//
//    public class C2 implements AutoCloseable {
//
//        @Override
//        public void close() throws Exception {
//
//        }
//    }

}
