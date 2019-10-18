package com.astro.loan.loanresourceserver.controller;

import com.astro.loan.loanresourceserver.model.Cat;
import com.astro.loan.loanresourceserver.proxy.FileUploadProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class TestController {

    @Autowired
    private FileUploadProxy fileUploadProxy;

    private static final Logger log = LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/resource/test")
    public String test() {
        log.info("in test");
        return "";//fileUploadProxy.test();
    }

    @PostMapping("/resource/cat")
    public Cat test(@RequestBody Cat cat) {
        log.info("cat value {}",cat);
        return cat;
    }

}
