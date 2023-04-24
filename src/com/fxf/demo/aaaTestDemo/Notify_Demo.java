package com.fxf.demo.aaaTestDemo;

import java.util.concurrent.TimeUnit;

public class Notify_Demo {
    private static int reduceThreadCount =0;
    /**
     * @param args
     */
    public static void main(String[] args) {
        Notify_Demo notify = new Notify_Demo();
        Source source = notify.new Source("source");

        for (int i = 0; i < 10; i++)
            notify.new ReduceThread(source).start();
//		try {
//			TimeUnit.SECONDS.sleep(5);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
            notify.new AddThread(source).start();
    }

    class ReduceThread extends Thread{

        private Source source;
        public ReduceThread(Source source){
            super("ReduceThread-" + reduceThreadCount++);
            this.source = source;
        }
        public void run(){
            for (int i = 0; i < 10; i++){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                source.reduceCount();
            }
        }
    }
    class AddThread extends Thread{
        private Source source;
        public AddThread(Source source){
            super("AddThread");
            this.source = source;
        }
        public void run(){
            for (int i = 0; i < 1; i++){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                source.addCount();
            }
        }
    }
    class Source{
        private int count = 0;
        public Source(String name){
//			this.name = name;
        }
        public synchronized void addCount() {
            System.out.println(Thread.currentThread().getName()+": count+1="+ ++count);
            notify();
        }
        public synchronized void reduceCount() {
            while (count <= 0) {
                try {
                    System.out.println(Thread.currentThread().getName()+" wait()");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+": count-1="+ --count);
        }
    }

}
