/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Kaiyuan
 */
public class Address {
    String street;
    String city;
    String state;
    String country;
    int zip;
    
    public Address()
    {
        
    
    }
    public Address(String street){
        this.street = street;
    }
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZip() {
        return zip;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
	
}
