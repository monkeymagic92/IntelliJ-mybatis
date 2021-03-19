package com.whitepaek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home/*")
public class HomeController {

    @Autowired
    private HomeService service;

    @GetMapping("test")
    public @ResponseBody String hometest() {
        System.out.println("test url 실행");
        return "Spring + Maven";
    }

    @GetMapping("pig")
    public String pig(Model model) {
        model.addAttribute("name", "돼지 입니다");
        return "test";
    }

    @GetMapping("cat")
    public String cat(Model model, HttpServletRequest req) {

        String a = req.getParameter("a");
        if(a == null) {
            model.addAttribute("null", "널임");
        } else {
            model.addAttribute("notNull", "널아님" + a);
        }

        model.addAttribute("cat", "고양이 입니다");
        return "cat";
    }

    @RequestMapping(value="dog", method = RequestMethod.GET)
    public String dog(Model model) {
        model.addAttribute("dog", "강아지 입니다");
        return "dog";
    }

    @GetMapping("user")
    public String selUser(UserDTO dto, Model model) {

        dto = service.selUser();
        model.addAttribute("list", dto);
        return "selUser";
    }
}
