package proxy;

import proxy.bean.CglibProgrammer;
import proxy.impl.CglibProxyTest;

public class CGlibProxy {

    public static void main(String[] args) {
        CglibProgrammer cglibProgrammer = (CglibProgrammer) CglibProxyTest.getInstance();
        cglibProgrammer.work();
    }
}
