package com.woniuxy.wuye.web;

import com.woniuxy.wuye.entity.User;
import com.woniuxy.wuye.service.MenuService;
import com.woniuxy.wuye.service.UserService;
import com.woniuxy.wuye.vo.ResponseResult;
import com.woniuxy.wuye.vo.UserMenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public ResponseResult<?> login(@RequestBody User user, HttpSession session) {

        User u = userService.login(user.getAccount(), user.getPassword());
        session.setAttribute("user", u);
        return ResponseResult.ok();
    }


    @PostMapping("/add")
    public ResponseResult<Void> addUserMenu(@RequestBody UserMenuVO userMenuVO) {
        userService.addUserMenu(userMenuVO.getUser(), userMenuVO.getMenuIds());
        return ResponseResult.ok();

    }


    @GetMapping("/list")
    public ResponseResult<List<User>> list() {
        List<User> list = userService.getAll();
        return ResponseResult.ok(list);

    }

}
