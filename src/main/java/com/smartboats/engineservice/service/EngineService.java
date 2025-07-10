package com.smartboats.engineservice.service;

import com.smartboats.engineservice.dto.EngineRequestDTO;
import com.smartboats.engineservice.entity.Engine;
import com.smartboats.engineservice.dto.EngineResponseDTO;
import com.smartboats.engineservice.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Year;
import java.util.Random;
@Service
public class EngineService
{

    @Autowired
    EngineRepository engineRepository;
    public void CreateEngines(EngineRequestDTO enginerequestdto) {
        int engineCount = Integer.parseInt(enginerequestdto.getNumberOfEngines());
        String engineNumber = null;
        for (int i = 0; i < engineCount; i++) {
            engineNumber = generateEngineNUmber();
            Engine engine = new Engine();
            engine.setModelNumber(enginerequestdto.getModelNUmber());
            engine.setEngineNumber(engineNumber);
            engine.setEngineType(enginerequestdto.getEngineType());
            engine.setHorsePower(enginerequestdto.getHorsePower());
            engine.setFuelType(enginerequestdto.getFuelType());
            engine.setStatus(enginerequestdto.getEngineType());
            engine.setManufacturingDate(LocalDate.now());
            engineRepository.save(engine);
        }
    }
    private String generateEngineNUmber()
    {
        Random random = new Random();
        int year = Year.now().getValue()%100;
        int digits = 100 + random.nextInt(900);
        char chars = (char)('A'+random.nextInt(26));
        return String.format("%02d%03d%c", year, digits, chars);
    }


}

    // Additional methods for update, delete, etc. can be added here

