//package main;
//
//import newThread.MyThread02;
//
///**
// * @创建人 shangjie
// * @创建时间 2017/11/17
// * @描述
// */
//public class Main {
//    //针对Mythread01的主方法
////    public static void main(String[] args){
////        MyThread01 t1,t2;
////        //创建两个线程对象
////        t1 = new MyThread01("shangjie");
////        t2 = new MyThread01("shangjing");
////        //启动两个线程
////        t1.start();
////        t2.start();
////
////    }
//
//    //针对Mythread02的主方法
////    public static void main(String[] args){
////        MyThread02 t1,t2;
////        //创建两个线程对象
////        t1 = new MyThread02("shangjie");
////        t2 = new MyThread02("shangjing");
////        //启动两个线程
////        t1.start();
////        t2.start();
////        System.out.println("主线程结束");
////    }
//    //针对主线程，目的让主线程最后执行
//    public static void main(String[] args){
//        MyThread02 t1,t2;
//        //创建两个线程对象
//        t1 = new MyThread02("shangjie");
//        t2 = new MyThread02("shangjing");
//        //启动两个线程
//            t1.start();
//            t2.start();
//            t1.join();
//            t2.join();
//
//        System.out.println("主线程结束");
//    }
//}
