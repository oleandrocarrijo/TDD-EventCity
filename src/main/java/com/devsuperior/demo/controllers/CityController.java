package com.devsuperior.demo.controllers;

import com.devsuperior.demo.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/cities")
public class CityController {

    @Autowired
    private CityService service;
}
