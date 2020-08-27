package com.lagou.test;

import com.lagou.dao.IUserDao;
import com.lagou.io.Resource;
import com.lagou.pojo.User;
import com.lagou.sqlSession.SqlSession;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;
import org.dom4j.DocumentException;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.util.List;

public class IpTest
{

    @Test
    public void test() throws PropertyVetoException, DocumentException {

        InputStream rsourceAsStream = Resource.getRsourceAsStream("sqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(rsourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(2);
//        user.setName("xiaobai");
//        User o = sqlSession.selectOne("user.selectOne", user);
//        System.out.println(o.toString());
//        List<User> objects = sqlSession.selectList("user.selectList");
//        objects.forEach(item ->{
//            System.out.println(item);
//        });
        IUserDao iUserDao = sqlSession.getMapper(IUserDao.class);
//        List<User> all = iUserDao.findAll();
//        System.out.println(all.get(0));
//        System.out.println(all.get(1));

//        User user1 = iUserDao.findAllCondition(user);
//        System.out.println(user1);
        int i = iUserDao.deleteUser(user);
        System.out.println(i);


    }
}

//class A {
//    public static void main(String[] args) throws Exception {
//
//        User user = new User();
//
//        user.setId(1);
//        user.setName("xiaobai");
//        Class<?> aClass = Class.forName("com.lagou.pojo.User");
//        Object o = aClass.newInstance();
//
//        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("id",aClass);
//        Method writeMethod = propertyDescriptor.getWriteMethod();
//        writeMethod.invoke(o,220);
//
//        System.out.println(o);
//
//
//    }
//}