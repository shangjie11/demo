package huchi;

/**
 * @创建人 shangjie
 * @创建时间 2017/11/20
 * @描述  false 执行线程5，true 执行线程4
 */
public class MyThread05 extends Thread {
    //注册另外一个线程类
    private Mythread04 myThread04;

    @Override
    public void run() {
        for(int i = 1;i <= 100;i++){
            if(Commons00.flag){
                synchronized (this){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            Commons00.flag = true;
            System.out.println("设置数据为：" + Commons00.count);
            synchronized (myThread04){
                myThread04.notify();
            }
        }
    }

    public void getMyThread04(Mythread04 mythread04){
        myThread04 = mythread04;
    }
}
