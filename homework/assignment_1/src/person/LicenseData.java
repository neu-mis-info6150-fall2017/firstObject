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
public class LicenseData {
    String licenseNo;
    String issueDate;
    String expDate;
    double height;
    String weight;
    
    public String getLicenseNo() {
        return licenseNo;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public double getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

}
