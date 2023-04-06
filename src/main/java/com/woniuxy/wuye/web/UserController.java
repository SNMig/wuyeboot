package com.woniuxy.wuye.web;

import com.woniuxy.wuye.entity.User;
import com.woniuxy.wuye.service.MenuService;
import com.woniuxy.wuye.service.UserService;
import com.woniuxy.wuye.vo.ResponseResult;
import com.woniuxy.wuye.vo.UserMenuVO;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseResult<Void> login(@RequestBody User user, HttpSession session) {
        ResponseResult<Void> responseResult=new ResponseResult<>();
        User u = userService.login(user.getAccount(), user.getPassword());

        try {
            if (u != null) {
                session.setAttribute("user",u);
                responseResult.setCode(200);
                responseResult.setMsg("成功");
                return responseResult;
            } else {
                responseResult.setCode(300);
                responseResult.setMsg("登录失败");

                return responseResult;
            }
        }catch (Exception e){
            responseResult.setCode(-1);
            responseResult.setMsg("系统错误");
        }
        return responseResult;
    }


    @PostMapping("/add")
    public ResponseResult<Void>addUserMenu(@RequestBody UserMenuVO userMenuVO){
        userService.addUserMenu(userMenuVO.getUser(),userMenuVO.getMenuIds());
        ResponseResult<Void>responseResult=new ResponseResult<>();
        responseResult.setCode(200);
        responseResult.setMsg("ok");
        return responseResult;
    }

    @GetMapping("/list")
    public ResponseResult<List<User>>list(){
        List<User>list=userService.getAll();
        ResponseResult<List<User>>responseResult=new ResponseResult<>();
        responseResult.setData(list);
        responseResult.setCode(200);
        responseResult.setMsg("ok");
        return responseResult;
    }

}
