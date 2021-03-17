package com.hotel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HotelController {

    @RequestMapping(value="/hotel", method = RequestMethod.GET)
    public String main(Model model) {
        model.addAttribute("name", "이재용");
        return "test";
    }

}
