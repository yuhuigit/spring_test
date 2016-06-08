
import org.junit.Test;
import org.junit.runner.RunWith;
import transaction.module.User;
import transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by jd on 2016/06/08.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class TestTran1 {
    @Autowired
    private UserService userService;

    @Test
    public void testUser(){
        User user = userService.getUserbyId(1);
        System.out.println("user:"+user);
    }

}
