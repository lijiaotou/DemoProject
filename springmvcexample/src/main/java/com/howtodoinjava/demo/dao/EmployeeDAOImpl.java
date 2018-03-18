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
    	

    	//��ȡ�����ļ����õ�SqlSessionFactory����
    	 String resource="conf.xml";
    	 SqlSessionFactory sessionFactory=null;
    	 try {
    	    Reader reader=Resources.getResourceAsReader(resource);
    	    
    	    //����sqlSession�Ĺ���
    	    sessionFactory=new SqlSessionFactoryBuilder().build(reader);
    	 } catch (IOException e) {
    	    e.printStackTrace();
    	 }

    	//ͨ��SqlSessionFactory�õ�SqlSession������������ͨ���ö���ִ����ɾ��Ĳ�
    	//���ģ���Ӧ��JDBC�е�Connection��
    	SqlSession session=sessionFactory.openSession();
 
        /**
         * ӳ��sql�ı�ʶ�ַ�����
         * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
         * getUser��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
         */
        String statement = "com.howtodoinjava.demo.mapping.employeeMapper.getEmployeebyid";//ӳ��sql�ı�ʶ�ַ���
        //ִ�в�ѯ����һ��Ψһuser�����sql
        EmployeeVO user1 = session.selectOne(statement, 1);
        EmployeeVO user2 = session.selectOne(statement, 2);
        
        List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
        employees.add(user1);
        employees.add(user2);
        
        return employees;
    }
    
    
}