/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plane;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


/**
 *
 * @author Kaiyuan
 */
public class Plane {
    String make;
    int year;
    int minSeats;
    int maxSeats;
    String serialNo;
    String modelNo;
    String airliner;
    String updateFleet;
    String airport;
    String mainStatus;
    String availStatus;
    int planeId;
    String departure;
    int seats;
    
    
    public Plane(String serialNo, int year, String modelNo, String airliner, String mainStatus, int seats, String departure, String airport, String make, String availStatus){
        this.serialNo = serialNo;
        this.year = year;
        this.modelNo = modelNo;
        this.airliner = airliner;
        this.mainStatus = mainStatus;
        this.seats = seats;
        this.departure = departure;
        this.airport = airport;
        this.make = make;
        this.availStatus = availStatus;
        
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

  

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public String getUpdateFleet() {
        return updateFleet;
    }

    public void setUpdateFleet(String updateFleet) {
        this.updateFleet = updateFleet;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getMainStatus() {
        return mainStatus;
    }

    public void setMainStatus(String mainStatus) {
        this.mainStatus = mainStatus;
    }

    public String getAvailStatus() {
        return availStatus;
    }

    public void setAvailStatus(String availStatus) {
        this.availStatus = availStatus;
    }

    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(int minSeats) {
        this.minSeats = minSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    @Override
    public String toString(){
        return this.airliner;
    }
    
}
