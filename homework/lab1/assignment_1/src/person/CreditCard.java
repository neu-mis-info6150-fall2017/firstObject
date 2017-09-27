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
public class CreditCard {
    int creditNo;
    String cvs;
    String exDate;
    String creationYear;
    String type;

    public int getCreditNo() {
        return creditNo;
    }

    public String getCvs() {
        return cvs;
    }

    public String getExDate() {
        return exDate;
    }

    public String getCreationYear() {
        return creationYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCreditNo(int creditNo) {
        this.creditNo = creditNo;
    }

    public void setCvs(String cvs) {
        this.cvs = cvs;
    }

    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    public void setCreationYear(String creationYear) {
        this.creationYear = creationYear;
    }
	
}
