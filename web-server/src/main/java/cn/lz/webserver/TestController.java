package cn.lz.webserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String test(@RequestHeader("Token") String token) {
        logger.info("name {}", token);
        return "header: " + token;
    }
}
