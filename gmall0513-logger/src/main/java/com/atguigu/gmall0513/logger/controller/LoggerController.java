package com.atguigu.gmall0513.logger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class LoggerController {

    @PostMapping("/log")
    public String log(@RequestParam("logString") String logString) {
        log.info(logString);
        return "success";
    }


}
