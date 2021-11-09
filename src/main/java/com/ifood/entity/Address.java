package com.ifood.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class which abstract Store's Addresses
 *
 * @author Gabriel Menezes
 * @version 1.0
 */
public class Address implements Serializable {
    protected static final long serialVersionUID = 1L;
    protected int id;
    protected int postalCode;
    protected String state;
    protected String city;
    protected String district;
    protected String address;
    protected int number;
    protected String adjunct;

    public Address() {
    }

    public Address(int id, int postalCode, String state, String city, String district, String address, int number,
            String adjunct) {
        this.id = id;
        this.postalCode = postalCode;
        this.state = state;
        this.city = city;
        this.district = district;
        this.address = address;
        this.number = number;
        this.adjunct = adjunct;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAdjunct() {
        return this.adjunct;
    }

    public void setAdjunct(String adjunct) {
        this.adjunct = adjunct;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Address)) {
            return false;
        }
        Address addressObj = (Address) o;
        return id == addressObj.id && postalCode == addressObj.postalCode && Objects.equals(state, addressObj.state)
                && Objects.equals(city, addressObj.city) && Objects.equals(district, addressObj.district)
                && Objects.equals(address, addressObj.address) && number == addressObj.number
                && Objects.equals(adjunct, addressObj.adjunct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postalCode, state, city, district, address, number, adjunct);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", postalCode='" + getPostalCode() + "'" + ", state='" + getState() + "'"
                + ", city='" + getCity() + "'" + ", district='" + getDistrict() + "'" + ", address='" + getAddress()
                + "'" + ", number='" + getNumber() + "'" + ", adjunct='" + getAdjunct() + "'" + "}";
    }

}
