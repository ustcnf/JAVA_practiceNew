import org.junit.Test;

/**
 * 
 * @author Administrator
 * �����ڶ�̬�������󣬲����������ڼ��������ԣ�����
 * ���� 
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
