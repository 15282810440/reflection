package proxy.bean;

import proxy.service.Worker;

/**
 * @author 何欣
 * @date 2019/3/20 11:46
 */
public class Programmer implements Worker {
    public void doWorker() {
        System.out.println("开始工作");
    }

    public void broker(){
        System.out.println("开始第二份工作");
    }
}
