package com.devsuperior.demo.controllers;

import com.devsuperior.demo.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/events")
public class EventController {

    @Autowired
    private EventService service;
}
