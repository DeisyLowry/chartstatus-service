package com.ttrc.chartstatus.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chartpositions")
@AllArgsConstructor
public class chartstatusController {


    @GetMapping("/test")
    public String test(){
        return "Hello Test Inside";
    }


    // Build Save Chart Positions REST API
    @PostMapping
    public String saveChartPosition(){
        return "Inside the Post Call";
    }

    @DeleteMapping
    public String deleteChartPosition(){
        return "Inside the Delete Call";
    }
    @PutMapping
    public String updateChartPosition(){
        return "Inside the Put Call";
    }

    @GetMapping
    public String getAllStocks(){
        return "Inside the get all chart positions Call";
    }


    @GetMapping("/{id}")
    public String getEmployee(@PathVariable("id") String stockSymbol){
        String localSymbol = stockSymbol;
        return "Inside the get chart positions by code " + localSymbol;
    }


}
