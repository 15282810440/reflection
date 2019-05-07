package proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 何欣
 * @date 2019/3/20 11:47
 */
public class JDKProxyTets implements InvocationHandler {
    private Object target;
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调度之前做的事情");
        Object obj = method.invoke(target,args);
        System.out.println("调度之后做的事情");
        return obj;
    }
}
