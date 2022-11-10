package com.springframeworkgame.buildgameinspringframework.sample.enterprise.flow.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//business logic will be present
@Component
public class BusinessService {

    @Autowired
    private DataService dataService;

    public long calculateSum(){
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}