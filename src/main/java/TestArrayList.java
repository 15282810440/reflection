import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 何欣
 * @date 2019/3/20 11:33
 */
public class TestArrayList {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        Class clazz = list.getClass();
        Method method = clazz.getMethod("add",Object.class);
        method.invoke(list,100);
        for(Object value : list){
            System.out.println(value);
        }
    }
}
