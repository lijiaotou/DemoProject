package com.howtodoinjava.demo.dao;
 

import java.util.ArrayList;

import java.util.List;
 
import org.springframework.stereotype.Repository;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.howtodoinjava.demo.model.EmployeeVO;
 
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
 
    public List<EmployeeVO> getAllEmployees()
    {
//        List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
// 
//        EmployeeVO vo1 = new EmployeeVO();
//        vo1.setId(1);
//        vo1.setFirstName("Lokesh");
//        vo1.setLastName("Gupta");
//        employees.add(vo1);
// 
//        EmployeeVO vo2 = new EmployeeVO();
//        vo2.setId(2);
//        vo2.setFirstName("Raj");
//        vo2.setLastName("Kishore");
//        employees.add(vo2);
// 
//        return employees;
    	

    	//读取配置文件，得到SqlSessionFactory对象
    	 String resource="conf.xml";
    	 SqlSessionFactory sessionFactory=null;
    	 try {
    	    Reader reader=Resources.getResourceAsReader(resource);
    	    
    	    //构建sqlSession的工厂
    	    sessionFactory=new SqlSessionFactoryBuilder().build(reader);
    	 } catch (IOException e) {
    	    e.printStackTrace();
    	 }

    	//通过SqlSessionFactory得到SqlSession对象，我们正是通过该对象执行增删查改操
    	//作的（对应于JDBC中的Connection）
    	SqlSession session=sessionFactory.openSession();
 
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "com.howtodoinjava.demo.mapping.employeeMapper.getEmployeebyid";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        EmployeeVO user1 = session.selectOne(statement, 1);
        EmployeeVO user2 = session.selectOne(statement, 2);
        
        List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
        employees.add(user1);
        employees.add(user2);
        
        return employees;
    }
    
    
}