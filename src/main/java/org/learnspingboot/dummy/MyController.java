package org.learnspingboot.dummy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {
    @RequestMapping("/hello")
    public static String hello() {
        return "Hello World!";
    }

    @GetMapping("/getMethodName")
    // num1 must be similar with frontend of name=="num1" and similar for num2
    public static String getData(@RequestParam String num1,@RequestParam String num2){
        String res=num1+num2;
        return res;
    }

    @PostMapping("/postMethodName")
    public static String getDataPost(@RequestParam String num1,@RequestParam String num2){
        String res=num1+num2;
        return res;
    }

    @GetMapping("/calculate")
    public int addTwoNumber(@RequestParam int num1,int num2) {
        int res=num1+num2;
        return res;
    }
    
    
}
