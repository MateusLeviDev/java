package org.levi.apicdc.apicdc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    @GetMapping("api/test")
    public String content() {
        return "success";
    }
}
