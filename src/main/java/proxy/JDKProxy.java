package proxy;

import proxy.bean.Programmer;
import proxy.impl.JDKProxyTets;
import proxy.service.Worker;

/**
 * @author 何欣
 * @date 2019/3/20 11:45
 */
public class JDKProxy {
    public static void main(String[] args) {
        JDKProxyTets jdkProxyTets = new JDKProxyTets();
        Worker worker = (Worker) jdkProxyTets.bind(new Programmer());
        worker.broker();
        worker.doWorker();
    }
}
