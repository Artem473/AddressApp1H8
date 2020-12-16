package ru.sapteh.Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.Locale;

public class Person {
    private String firstName;
    private String lastName;
    private String street;
    private int postalCode;
    private String city;
    private String birthday;

    public  Person(){

    }

    public  Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName ;

        this.street ="улица?";
        this.postalCode= 123;
        this.city ="город?";
        this.birthday ="1.2.3";
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
