package com.esliceu.ActivitatWorld.controllers;

import com.esliceu.ActivitatWorld.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {
    @Autowired
    Service myservice;


}
