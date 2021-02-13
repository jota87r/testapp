package com.jota;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TestController.class)
public class TestTest {
    @Autowired MockMvc mockMvc;
    @MockBean TestService testService;

    @Test
    public void test() {

    }
}
