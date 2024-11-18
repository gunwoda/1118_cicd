package com.gunwoda.awscicd;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aws")
public class FrontController {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
}
