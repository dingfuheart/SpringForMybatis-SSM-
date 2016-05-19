package testServiceImpl;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mybatis.dao.UserMapper;
import com.mybatis.model.User;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations={"classpath:config/spring-mybatis.xml"})

public class TestUserServiceImpl {
	private static Logger logger=Logger.getLogger(TestUserServiceImpl.class);
	private UserMapper userMapper=null;
	
	@Test
	public void testGetUserById(){
		User user=userMapper.selectByPrimaryKey(1);
		logger.info("姓名："+user.getUsername());
	}

}
