package proxy.impl;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import proxy.bean.CglibProgrammer;

import java.lang.reflect.Method;

public class CglibProxyTest implements MethodInterceptor {

    public static Object getInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibProgrammer.class);
        enhancer.setCallback(new CglibProxyTest());
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理前");
        //这个方法等同于调用这个 intercept方法
        Object obj = methodProxy.invokeSuper(o, objects);
//        Object obj = method.invoke(o, objects);
        System.out.println("代理后");
        return obj;
    }
}
