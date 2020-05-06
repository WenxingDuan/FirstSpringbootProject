package org.example.controller;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.entity.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Map;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/*
 * 用户控制层
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {



    @RequestMapping("/index")
    public String index() {
        return "index";
    }


    @GetMapping("/insert")
    public String addUser(Model model) {

        model.addAttribute("user", new User());
        return "insert";
    }

    @PostMapping("/insert")
    public String greetingSubmit(@ModelAttribute User inputUser) {
        User user = new User();
        user.setUserName(inputUser.getUserName());
        user.setPassword(inputUser.getPassword());
        user.setId(inputUser.getId());
        user.setAge(inputUser.getAge());

        //TODO implement insert method

        return "success";

    }


    @RequestMapping("/getId")

    public User likeName(String name){

        UserDaoImpl dao = new UserDaoImpl();
        return dao.getById(name);

    }

}
