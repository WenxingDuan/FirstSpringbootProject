package org.example.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.entity.User;

public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl() {

    }


    public void insertUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            sqlSession.insert("org.example.controller.insertUser", user);
            sqlSession.commit();
            sqlSession.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    private UserDao dao;

    public User getById(String name){
        return dao.getById(name);

    }


}
