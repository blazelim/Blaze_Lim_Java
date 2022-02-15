package com.company;

import java.util.Objects;

public class Address {
    private String streetFirstLine;
    private String streetSecondLine;
    private String city;
    private String state;
    private String zipcode;

    public Address(String streetFirstLine, String streetSecondLine, String city, String state, String zipcode) {
        this.streetFirstLine = streetFirstLine;
        this.streetSecondLine = streetSecondLine;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreetFirstLine() {
        return streetFirstLine;
    }

    public void setStreetFirstLine(String streetFirstLine) {
        this.streetFirstLine = streetFirstLine;
    }

    public String getStreetSecondLine() {
        return streetSecondLine;
    }

    public void setStreetSecondLine(String streetSecondLine) {
        this.streetSecondLine = streetSecondLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(streetFirstLine, address.streetFirstLine) && Objects.equals(streetSecondLine, address.streetSecondLine) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(zipcode, address.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetFirstLine, streetSecondLine, city, state, zipcode);
    }
}
