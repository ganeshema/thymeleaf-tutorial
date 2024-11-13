package com.ganeshgc.thymeleaftutorial.controller;

import com.ganeshgc.thymeleaftutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VariableExpressionController {

    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user=new User("Ganesh GC", "ganeshgc@gmail.com", "Admin", "Male", "504553433433");
        model.addAttribute("user",user);
        return "variable-expression";

    }
}
