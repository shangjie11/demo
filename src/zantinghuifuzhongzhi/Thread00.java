package zantinghuifuzhongzhi;

/**
 * @创建人 shangjie
 * @创建时间 2017/11/20
 * @描述
 */
public class Thread00 extends Thread {
    private static int STOP = 1;
    private static int SUSPEND = 3;
    private static int RUNNING = 2;
    private static int STATE = STOP;

    @Override
    public void run() {
        int count = 1;
        //判断线程的状态
        while(STATE != STOP){
            //判断线程是否处于挂起状态
            if(STATE == SUSPEND){
                //将线程挂起
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            System.out.println("线程处于运行状态："+count);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //将线程终止
    public void normalStop(){
        STATE = STOP;
    }

}
