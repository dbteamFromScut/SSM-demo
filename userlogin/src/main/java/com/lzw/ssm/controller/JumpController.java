package com.lzw.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class JumpController {

        /**
         * 跳转登陆
         *
         *
         */
        @RequestMapping(value="/index")
        public String toIndex(){
            return "views/loginForm";
        }

        @RequestMapping(value = "toRegister")
        public String  toRegister(){
            return "register";
        }

        @RequestMapping(value = "toLogin")
        public String  toLogin(){
            return "loginForm";
        }

        @RequestMapping(value = "outLogin")
        public String  outLogin(HttpServletRequest request){
            request.getSession().invalidate();
            return "loginForm";
    }

        @RequestMapping(value = "toMain")
        public String  toMain(HttpServletRequest request, ModelMap modelMap){
            modelMap.addAttribute("name",request.getSession().getAttribute("user_name"));
            return "main";
    }

        @RequestMapping(value = "toUpdate")
        public String  toUpdate(){
        return "updateForm";
    }
}
