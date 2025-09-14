package br.edu.iftm.PPWIIJAVA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AviaoController {
    
    @GetMapping("/aviao")
    public String getMethodName(){
        return "/aviao/index";
    }

}
