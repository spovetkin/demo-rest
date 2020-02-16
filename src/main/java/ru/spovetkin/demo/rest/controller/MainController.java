package ru.spovetkin.demo.rest.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.spovetkin.demo.rest.service.CalcService;

@RequestMapping("/")
@RestController
public class MainController {

    private CalcService service;

    public MainController(@Qualifier(value = "calcServicePlusImpl") CalcService service) {
        this.service = service;
    }

    @GetMapping("calc1")
    public long calc1(@RequestParam() long a,
                      @RequestParam() long b) {
        return service.sum(a, b);
    }

    @GetMapping("calc2")
    public long calc2(@RequestParam() long a,
                      @RequestParam() long b) {
        return service.sum(a, b);
    }

}
