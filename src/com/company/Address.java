package com.company;

import java.io.Serializable;

public class Address implements Serializable {

    private String street;

    private String zipNumber;

    private String city;

    Address(String street, String zipNumber, String city) {
        this.street = street;
        this.zipNumber = zipNumber;
        this.city = city;
    }

    public String getZipNumber() {
        return zipNumber;
    }

    public void setZipNumber(String zipNumber) {
        this.zipNumber = zipNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zipNumber='" + zipNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
