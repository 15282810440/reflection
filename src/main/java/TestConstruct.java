
import javax.annotation.Resource;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


@Resource
public class TestConstruct {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       Class clazz = Class.forName("Student");
       for(Constructor constructor : clazz.getConstructors()){
           System.out.println(constructor);
       }

       for(Constructor constructor :clazz.getDeclaredConstructors()){
           System.out.println(constructor);
       }

        Constructor constructor = clazz.getConstructor(null);
        System.out.println(constructor);
        Object obj = constructor.newInstance();
        System.out.println(obj);


        Constructor cons = clazz.getDeclaredConstructor(int.class);
        System.out.println(cons);
        cons.setAccessible(true);
        Object obj1 = cons.newInstance(1);
    }
}
