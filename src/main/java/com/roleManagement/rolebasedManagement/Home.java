package com.roleManagement.rolebasedManagement;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Home {
    Logger logger= LoggerFactory.getLogger(Home.class);
    @GetMapping("/home")
    public String home(){
        logger.info("Error happend");
        return "Home page";
    }
}
