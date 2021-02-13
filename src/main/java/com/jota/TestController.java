package com.jota;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    @ResponseBody
    public TestEntity create() {
        return testService.create();
    }
}
