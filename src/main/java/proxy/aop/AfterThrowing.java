package proxy.aop;

import proxy.service.AopWork;
import proxy.service.Worker;

/**
 * 异常增强处理
 */
public class AfterThrowing implements AopWork {

    public AfterThrowing(Worker worker){
        this.work = worker;
    }

    private Worker work;

    @Override
    public void doWorker() {
        try{
            work.doWorker();
        }catch (Exception e){
            System.out.println("异常增强处理启动");
        }
    }
}
