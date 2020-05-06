package org.example.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.entity.User;


public interface UserDao {


    public void insertUser(User user) throws Exception;

    @Select("select *from Demo where id = #{id}")
    public User getById(String id);

}
