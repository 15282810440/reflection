
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestMethods {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class clazz = Class.forName("Student");
        for(Method method : clazz.getMethods()){
            System.out.println(method);
        }
        for(Method method : clazz.getDeclaredMethods()){
            System.out.println(method);
        }
        //获取公开的某个方法 根据方法名称获取 传入参数 根据参数选择重载
        Method method = clazz.getMethod("show11",String.class);
        System.out.println(method);
        Object obj = clazz.newInstance();
        method.invoke(obj,"aaa");

        Method declaredMethod = clazz.getDeclaredMethod("show4",int.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(obj,1);

    }
}
