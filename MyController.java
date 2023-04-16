package com.controller;

import com.model.SysAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/9/14.
 */
@Controller
@RequestMapping("/MyController")
public class MyController {
    @Autowired
    private SysAction sysAction;

    public MyController(){
        System.out.print("------------------+++++++");
    }
    @RequestMapping("/printScopeBean")
    @ResponseBody
    public void printScopeBean(){
        System.out.println(sysAction);
    }


}
