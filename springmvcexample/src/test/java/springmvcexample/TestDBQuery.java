package springmvcexample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.howtodoinjava.demo.model.EmployeeVO;
import com.howtodoinjava.demo.service.EmployeeManagerImpl;;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations="classpath:../spring-servlet.xml") 
public class TestDBQuery {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//EmployeeManagerImpl manager = new  EmployeeManagerImpl();
		//List<EmployeeVO> employees = manager.getAllEmployees();
		//assertTrue("Get employees fail! ", employees.size() >0);
	}

}
