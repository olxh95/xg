package cn.itsource.xg.web.controller;

import cn.itsource.xg.domain.Employee;
import cn.itsource.xg.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername())&&"0".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功!");
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误!");
    }
}
