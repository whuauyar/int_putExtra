package com.platzi.play;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloControllerImpl extends HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello Mundo Word";
    }
}
