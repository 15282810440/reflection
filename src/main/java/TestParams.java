import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 何欣
 * @date 2019/3/20 10:56
 */
public class TestParams {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("Student");
        //获取所有共有字段
        for(Field field : clazz.getFields()){
            System.out.println(field);
        }
        for(Field field : clazz.getDeclaredFields()){
            System.out.println(field);
        }
        Field fieldName = clazz.getField("name");
        //获取字段名称列 并且向列中注入数据l
        Object obj = clazz.getConstructor().newInstance();
        fieldName.set(obj,"张恒");
        Student student = (Student)obj;
        System.out.println(student.name);

        Field fieldphoneNum= clazz.getDeclaredField("phoneNum");
        fieldphoneNum.setAccessible(true);
        fieldphoneNum.set(obj,"1254654486");

        Student student1 = (Student)obj;
        System.out.println(student1);
    }
}
