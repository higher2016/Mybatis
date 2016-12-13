import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jm.dao.TestViewMapper;
import com.jm.model.Bug;
import com.jm.model.TestView;
import com.jm.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestUserService {

	@Autowired
	private UserServiceI userService;
	@Autowired
	private TestViewMapper testViewMapper;
//	//表示spring上下文
//	private ApplicationContext ac;
	
	/**
	 * before:执行任意@Test单元方法之前所要执行的方法
	 * 
	 * @author JM 2016-12-1 下午10:05:02
	 */
//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
//		userService = (UserServiceI) ac.getBean("userService");
//		testViewMapper = (TestViewMapper) ac.getBean("userService");
//	}

	@Test
	public void testTbug() {
		Bug tbug = userService.getBugById(1L);
		System.out.println(tbug.gettBugId());
		List<TestView> tvServiceList = userService.getTestView();

		List<TestView> tvDaoList = testViewMapper.loadTestView();
		for (TestView tv : tvServiceList) {
			System.out.println(tv);
		}
		for (TestView tv : tvDaoList) {
			System.out.println(tv);
		}
	}
}