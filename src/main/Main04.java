package main;


import huchi.MyThread05;
import huchi.Mythread04;
/**
 * @创建人 shangjie
 * @创建时间 2017/11/20
 * @描述
 */
public class Main04 {
    public static void main(String[] args){
        Mythread04 first;
        first = new Mythread04();
        MyThread05 second;
        second = new MyThread05();
        first.getMythread05(second);
        second.getMyThread04(first);
        first.start();
        second.start();
    }
}
