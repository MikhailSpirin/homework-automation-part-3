package com.wix.automationtraining;

/**
 * Created by mikhails on 25.07.2016
 */
public class Address {
    private String street, city, state;
    private int houseNumber, zipCode;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setStreet(String street) {
        if (street==null) { this.street = "unknown";
        } this.street = street;

    }

    public void setCity(String city) {
        if (city==null) { this.city = "unknown";
        } this.city = city;
    }

    public void setState(String state) {
        if (state==null) { this.state = "unknown";
        } else this.state = state;
    }

    public void setHouseNumber(int houseNumber) {
        if (houseNumber < 0) { this.houseNumber = 0;
        } else this.houseNumber = houseNumber;
    }

    public void setZipCode(int zipCode) {
        if (zipCode < 0) { this.zipCode = 0;
        } else this.zipCode = zipCode;
    }

    public Address(String street, String city, String state, int houseNumber, int zipCode) {
        setStreet(street);
        setCity(city);
        setState(state);
        setHouseNumber(houseNumber);
        setZipCode(zipCode);
    }

    @Override
    public String toString(){
        return this.houseNumber + " " + this.street + " st., " + this.city +", " + this.state;
    }

    @Override
    public boolean equals(Object address){
        Address castAddress = (Address) address;
        return castAddress.street.equals(this.street) &&
                castAddress.city.equals(this.city) &&
                castAddress.state.equals(this.state) &&
                castAddress.houseNumber==this.houseNumber &&
                castAddress.zipCode==this.zipCode;
    }

    public Address duplicate () {
        return new Address(this.street, this.city, this.state,
                this.houseNumber,this.zipCode);
    }
}
