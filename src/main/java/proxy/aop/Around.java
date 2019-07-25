package proxy.aop;

import proxy.service.AopWork;
import proxy.service.Worker;

/**
 * 环绕增强处理
 */
public class Around implements AopWork {
    public Around(Worker worker){
        this.work = worker;
    }

    private Worker work;

    @Override
    public void doWorker() {
        System.out.println("环绕前置增强处理启动");
        work.doWorker();
        System.out.println("环绕后置增强处理启动");
    }
}
