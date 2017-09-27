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
/**
 *
 * @author Kaiyuan
 */
public class PlaneHistory {
    private ArrayList<Plane> planeHistory;
    public PlaneHistory() throws FileNotFoundException{
    planeHistory = new ArrayList<Plane>();
    String csvFile = "/C:/Users/Kaiyuan/Documents/NetBeansProjects/Assignment2/assignment2.csv";
        String line = "";
        String cvsSplitBy = ",";
        String cvsTrim = cvsSplitBy.trim();
        

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] airPlane = line.split(cvsTrim);
                String tempserialNo = airPlane[0];
                    int tempyear = Integer.parseInt(airPlane[1]);
                    String tempmodelNo = airPlane[2];
                    String tempairliner = airPlane[3];
                    String tempmainStatus = airPlane[4];
                    int tempseats = Integer.parseInt(airPlane[5]);
                    String tempdeparture = airPlane[6];
                    String tempairport = airPlane[7];
                    String tempmake = airPlane[8];
                    String tempavailStatus = airPlane[9];
                   Plane tempPlane = new Plane(tempserialNo,tempyear,tempmodelNo,tempairliner,tempmainStatus,tempseats,tempdeparture,tempairport,tempmake,tempavailStatus);
                   planeHistory.add(tempPlane);
                

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        

      
    }
    
   

    public ArrayList<Plane> getPlaneHistory() {
        return planeHistory;
    }

    public void setPlaneHistory(ArrayList<Plane> planeHistory) {
        this.planeHistory = planeHistory;
    }
  
    public void delete(Plane pl){
        planeHistory.remove(pl);
    }
   
  
    
    
    
    
}
