package com.springboot.highchart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class GraphController {

    @GetMapping("/displayBarGraph")
    public String barGraph(Model model){
        Map<String,Integer> surveyMap = new LinkedHashMap<>();
        surveyMap.put("Java",40);
        surveyMap.put(".NET",15);
        surveyMap.put("Python",20);
        surveyMap.put(".DevOps",25);
        model.addAttribute("surveyMap",surveyMap);
        return  "barGraph";
    }

    @GetMapping("/displayPieChart")
    public String  pieChart(Model model){
        model.addAttribute("pass",70);
        model.addAttribute("fail",30);
        return "pieChart";
    }
}
