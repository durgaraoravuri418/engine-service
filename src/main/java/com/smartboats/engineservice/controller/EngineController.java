package com.smartboats.engineservice.controller;

import com.smartboats.engineservice.dto.EngineRequestDTO;
import com.smartboats.engineservice.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EngineController
{
    @Autowired
    EngineService engineservice;

    @PostMapping("/createEngine")
    public void createEngine(@RequestBody EngineRequestDTO engineResponsedto)
    {
        engineservice.CreateEngines(engineResponsedto);
    }
}
