package com.gorson.springnettydisruptor.controller;

import com.gorson.springnettydisruptor.dto.GorsonDTO;
import com.gorson.springnettydisruptor.service.DisruptorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 此类的描述是：
 *
 * @create 2018-06-03 22:16
 **/
@RestController
@RequestMapping("/disruptor")
public class DisruptorController {

    @Resource
    private DisruptorService disruptorService;

    @GetMapping
    public String test() {
//        disruptorService.getGorsonEventProducer().onData(new GorsonDTO() {{
//            setId(1);
//            setName("gorson");
//        }});

        return "ok";
    }

    @GetMapping("/run")
    public String run() {
        Long timestamp = System.currentTimeMillis();

        for(int i = 0; i < 10000000; i++) {
            int finalI = i;
            disruptorService.getGorsonEventProducer().onData(new GorsonDTO() {{
                setId(finalI);
                setName("gorson");
            }});
        }

        return String.valueOf(System.currentTimeMillis() - timestamp);
    }
}
