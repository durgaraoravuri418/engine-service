package com.smartboats.engineservice.dto;

public class EngineRequestDTO
{
    private String modelNUmber;
    private String numberOfEngines;
    private String fuelType;
    private int horsePower;
    private String engineType;

    public String getModelNUmber() {
        return modelNUmber;
    }
    public void setModelNUmber(String modelNUmber) {
        this.modelNUmber = modelNUmber;
    }
    public String getNumberOfEngines() {
        return numberOfEngines;
    }
    public void setNumberOfEngines(String numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }


}
