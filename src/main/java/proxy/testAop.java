package proxy;


import proxy.aop.*;
import proxy.bean.Programmer;
import proxy.service.Worker;

public class testAop {
    public static void main(String[] args) {
//        测试AOP
        //1.首先扫描所有的增强类 这里因为自己实现 就直接实例化了
        //先实例化工作类
        Worker worker = new Programmer();
        // 按道理应该进行增强类排序 自己演示就不实现了
        // 环绕 ->前置->后置->异常->最终  这五个处理
        worker = new Around(worker);
        worker = new Before(worker);
        worker = new AfterReturning(worker);
        worker = new AfterThrowing(worker);
        worker = new After(worker);
        worker.doWorker();
        //这是基于装饰器模式的实现增强 如果需要实现aop  那么就需要使用动态代理  那么这里就只展示动态代理的效果
        //不展示如果使用动态代理加上装饰器模式进行 切面 inspect AOP

        //基于框架的实现 更灵活 但是自己根据框架的实现 可以参杂一些自己的设计和思想来设计
        //spring的实现  根据后置处理器 将当前类的所有增强接口和实现类进行排序 然后进行事件增强，如上述的一样  然后 set 到 代理类中
        // 代理类在执行的时候 调用方法  就会使用增强顺序和流程进行方法的增强
        //
    }
}
