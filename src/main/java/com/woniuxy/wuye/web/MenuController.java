package com.woniuxy.wuye.web;

import com.woniuxy.wuye.entity.Menu;
import com.woniuxy.wuye.entity.User;
import com.woniuxy.wuye.service.MenuService;
import com.woniuxy.wuye.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @GetMapping("/left")
    public ResponseResult<List<Menu>> left(HttpSession session){
        User user=(User)session.getAttribute("user");
        List<Menu> menus=menuService.getByUserId(user.getId());
        ResponseResult<List<Menu>>list=new ResponseResult<>();
        list.setCode(200);
        list.setMsg("ok");
        list.setData(menus);
        return list;
    }

    @GetMapping("/list")
    public ResponseResult<List<Menu>> getAll(){
        List<Menu>menus=menuService.getAll();
        List<Menu>parentMenus=new ArrayList<>();
        for (Menu menu : menus) {
            if (menu.getPid()==null){
                parentMenus.add(menu);
                for (Menu subMenu : menus){
                    if (subMenu.getPid()==menu.getId()){
                        menu.getSubMenus().add(subMenu);
                    }
                }
            }
        }
        ResponseResult<List<Menu>>responseResult=new ResponseResult<>();
        responseResult.setCode(200);
        responseResult.setMsg("ok");
        responseResult.setData(parentMenus);
        return responseResult;
    }
}
