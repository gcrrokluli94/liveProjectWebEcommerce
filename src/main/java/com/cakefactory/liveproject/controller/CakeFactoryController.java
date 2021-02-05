package com.cakefactory.liveproject.controller;

import com.cakefactory.liveproject.model.Cake;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping(value = "cakes")
public class CakeFactoryController {
    @GetMapping
    public String getCake(final Model model){
        List cakeList = IntStream.range(0,5)
                .mapToObj(this::getCake)
                .collect(Collectors.toList());
        model.addAttribute("cakeList", cakeList);
        return "cake";
    }

    private Cake getCake(int i){
        return new Cake((long) i, "Tiramissu" + i, (double)(100*i));
    }
}
