import org.junit.Test;

/**
 * 
 * @author Administrator
 * 可以在动态创建对象，并且在运行期间对象的属性，方法
 * 例如 
 */
public class ReflectDemo {
    @Test
    
    public void TestInfo() throws Exception
    {
    	String className = "Admin";
    	Class<?> clazz = Class.forName(className);
    	Admin admin = (Admin) clazz.newInstance();
    	
    }
}
