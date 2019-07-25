package proxy.aop;

import proxy.service.AopWork;
import proxy.service.Worker;

/**
 * 最终增强处理
 */
public class After implements AopWork {
    public After(Worker worker){
        this.work = worker;
    }

    private Worker work;

    @Override
    public void doWorker() {
        try{
            work.doWorker();
            System.out.println("前置增强");
        }catch (Exception e){

        }
        System.out.println("最终增强处理启动");
    }
}
