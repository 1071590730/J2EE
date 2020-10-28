package com.wangjianbiao.www;

/**
 * @create: 2020/10/28 19:33
 * @author: WangJianbiao
 */
public class Demo2Runnable implements Runnable {

    private Thread t;//线程
    private String threadName;//线程名

    Demo2Runnable(String name) {
        threadName = name;
        System.out.println("Creating（创造）" +  threadName );
    }

    @Override
    public void run() {
        System.out.println("Runing（运行run）"+ threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread(线程运行): " + threadName + ":" + i);
                //线程睡眠
                Thread.sleep(50);
            }
        }catch (InterruptedException e ){
            System.out.println("Thread " +  threadName + " interrupted(中断).");
        }
        System.out.println("Thread " +  threadName + " exiting（关闭）.");
    }

    public void start(){
        System.out.println("Starting(方法退出)："+ threadName);
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

class TestThread{

    public static void main(String args[]){
        Demo2Runnable R1 = new Demo2Runnable("Thread-1");
        R1.start();

        Demo2Runnable R2 = new Demo2Runnable("Thread-2");
        R2.start();
    }
}