package com.toy.shop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class RootController {

    @GetMapping("/member_join_page")
    public String member_join_page(){
        return "member/member_join_form";
    }
}
