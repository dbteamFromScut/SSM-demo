package com.lzw.ssm.controller;


import com.lzw.ssm.services.UserService;
import com.lzw.ssm.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class LoginController {

    @Resource
    UserService userService;

    @RequestMapping(value="/register",method=RequestMethod.GET)
    public String registerForm(){

        return "register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestParam("id")String id,
                          @RequestParam("password")String password,
                          @RequestParam("username")String username,
                           @RequestParam("submit_name")String submit_name) throws IOException {
        if (submit_name.equals("登陆")){
            return "loginForm";
        }

        if (password.equals("")||id.equals("")||username.equals(""))
        {
            return "registerFailCause2";
        }

        User user = new User();
        user.setId(id);
        user.setPassword(password);
        user.setUsername(username);
        if (userService.check(id)==0){
            userService.addUser(user);
            return "registerSuccess";
        }
        else {
            return "registerFailCause1";
        }




    }

    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String loginForm(){

        return "loginForm";
    }


    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(ModelMap modelMap,@RequestParam("id")String id,
                        @RequestParam("password")String password,
                        @RequestParam("submit_name")String submit_name,
                        HttpServletRequest request,
                        HttpServletResponse response){

        if (submit_name.equals("注册")){
            return "register";
        }

        if(userService.getPassword(id).equals(password)){
            modelMap.addAttribute("name",userService.getUserById(id).getUsername());
            request.getSession(true).setAttribute("login_user",id);
            request.getSession(true).setAttribute("user_pw",password);
            request.getSession(true).setAttribute("user_name",userService.getUserById(id).getUsername());

            return "main";
        }else {
            return "loginFail";
        }

    }


    @RequestMapping(value="/update",method=RequestMethod.GET)
    public String updateForm(){

        return "updateForm";
    }

    @RequestMapping(value="/update",method=RequestMethod.POST)
    public String update(ModelMap modelMap,@RequestParam("oldpassword")String oldpassword,
                        @RequestParam("newpassword")String newpassword,
                        @RequestParam("submit_name")String submit_name,
                         HttpServletRequest request, HttpServletResponse response){
        String id=request.getSession().getAttribute("login_user").toString();
        if (submit_name.equals("返回")){
            modelMap.addAttribute("name",userService.getUserById(id).getUsername());
            return "main";
        }

        if (userService.getPassword(id).equals(oldpassword)){
            request.getSession(true).setAttribute("user_pw",oldpassword);
            userService.updatePassword(newpassword,id);
            return "updateSuccess";
        }
        else {
            return "updateFail";
        }
    }

}
