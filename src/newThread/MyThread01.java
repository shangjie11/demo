package newThread;

/**
 * @创建人 shangjie
 * @创建时间 2017/11/17
 * @描述
 */
public class MyThread01 extends Thread {
    public static int count;
    @Override
    public void run(){
        for (int i=0;i <100;i++){
            count = count + 1;
            try {
                sleep(10);
            } catch (InterruptedException e) {
                //线程终断异常
                e.printStackTrace();
            }
            System.out.println("MyThread's is :" + getName() + "count:" + count);
        }
    }
    public MyThread01(String name){
        super(name);
    }
}
