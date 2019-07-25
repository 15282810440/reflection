package proxy.aop;

import proxy.service.AopWork;
import proxy.service.Worker;

/**
 * 后置增强处理
 */
public class AfterReturning implements AopWork {

    public AfterReturning(Worker worker){
        this.work = worker;
    }

    private Worker work;

    @Override
    public void doWorker() {
        work.doWorker();
        System.out.println("后置增强处理启动");
    }
}
