

import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
 @ContextConfiguration(locations={"classpath:spring.xml"})
public class TestClass {
 @Test
  public void test(){
     System.out.println("test");
  }
}
