package proxy;

import proxy.bean.CglibProgrammer;
import proxy.impl.CglibProxyTest;

/**
 * @author 何欣
 * @date 2019/4/3 14:51
 */
public class CGlibProxy {

    public static void main(String[] args) {
        CglibProgrammer cglibProgrammer = (CglibProgrammer) CglibProxyTest.getInstance();
        cglibProgrammer.work();
    }
}
