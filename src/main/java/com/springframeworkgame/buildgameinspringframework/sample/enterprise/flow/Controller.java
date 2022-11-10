package com.springframeworkgame.buildgameinspringframework.sample.enterprise.flow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Sending response to the user
@RestController
public class Controller {
    // "/sum" => 100
    @GetMapping("/sum")
    public long displaySum(){
        return 100;
    }

}

class BusinessService {
    //business logic will be present
}

class DataService {
    //getting data
}
