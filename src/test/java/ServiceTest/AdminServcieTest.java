package ServiceTest;
import come.bean.Admin;
import come.service.Adminservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/config/spring-context.xml",
        "classpath:/config/spring-mybatis.xml"})
public class AdminServcieTest {
    @Resource
    private Adminservice adminservice;
    @Test
    public void testgetByPhone(){
        Admin admin=adminservice.getByphone("15779720313");
        System.out.println(admin.getPassword());
    }




}
