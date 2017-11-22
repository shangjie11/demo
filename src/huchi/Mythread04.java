package huchi;

/**
 * @创建人 shangjie
 * @创建时间 2017/11/20
 * @描述
 */
public class Mythread04 extends Thread {
    //注册另外一个线程类
    private MyThread05 myThread055;

    @Override
    public void run() {
        for(int i = 1;i <= 100;i++){
            if(!Commons00.flag){
                synchronized (this){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            Commons00.flag = false;
            Commons00.count = (int)(Math.random()*1000);//强制类型转换
            System.out.println("设置数据为：" + Commons00.count);
            synchronized(myThread055){
                myThread055.notify();
            }
        }
    }
    public void getMythread05(MyThread05 mythread05){
        myThread055 = mythread05;
    }
}
