package testService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mybatis.model.User;
import com.mybatis.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})

public class TestUserService {
	private static Logger logger=Logger.getLogger(TestUserService.class);
	@Resource
	private UserService userService=null;
	
	@Test
	public void testGetUserById(){
		User user=userService.getUserById(1);
		logger.info("姓名："+user.getUsername());
	}

}
