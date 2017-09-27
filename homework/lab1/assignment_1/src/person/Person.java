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
public class Person {
    
    String name;
    Address address;
    CreditCard card;
    FinancialAccount account;
    LicenseData license;

    public Person() {
        address = new Address();
        card = new CreditCard();
        account = new FinancialAccount();
        license = new LicenseData();
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public CreditCard getCard() {
        return card;
    }

    public FinancialAccount getAccount() {
        return account;
    }

    public LicenseData getLicense() {
        return license;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public void setAccount(FinancialAccount account) {
        this.account = account;
    }

    public void setLicense(LicenseData license) {
        this.license = license;
    }
    
}
