package com.ohgiraffers.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

    @GetMapping("/test")
    public String test() {
        return "이건 젠킨스 테스트 1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "이건 젠킨스 테스트2";
    }
}
