package proxy.bean;

import proxy.service.Worker;


public class Programmer implements Worker {
    public void doWorker() {
        System.out.println("开始工作");
        //工作异常
//        int i = 1/0;
    }

    public void broker(){
        System.out.println("开始第二份工作");
    }
}
