package proxy.aop;

import proxy.service.AopWork;
import proxy.service.Worker;

/**
 * 前置增强处理
 */
public class Before implements AopWork {

    public Before(Worker worker){
        this.work = worker;
    }

    private Worker work;

    @Override
    public void doWorker() {
        System.out.println("前置增强处理启动");
        work.doWorker();
    }
}
