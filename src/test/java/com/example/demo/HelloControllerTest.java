package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testHello() {
        HelloController controller = new HelloController();
        assertEquals("Hello from GitHub Actions Java Application", controller.hello());
    }
}
