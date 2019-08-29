package com.iamsumeet.blog.configserverclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApplicationController {

    @GetMapping("getDBValues")
    public Map<String,String> getDBValues(@Value("${myapplication.database.ip}") String ip, @Value("${myapplication.database.port}") String port,
                                          @Value("${myapplication.database.user}") String user, @Value("${myapplication.database.pass}") String pass){

        return Map.of("databaseIp",ip, "databasePort",port, "databaseUser",user, "databasePass",pass); //JDK 9 feature
    }
}
