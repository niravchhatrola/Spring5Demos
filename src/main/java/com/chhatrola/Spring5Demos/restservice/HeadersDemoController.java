package com.chhatrola.Spring5Demos.restservice;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by niv214 on 20/4/20.
 */

@RestController
@RequestMapping("testheader")
public class HeadersDemoController {

    @GetMapping("/headerinfo")
    public void headersInfo(@RequestHeader HttpHeaders httpHeaders){
        List<String> hello = httpHeaders.get("hello");
        hello.forEach(System.out::println);
    }
}
