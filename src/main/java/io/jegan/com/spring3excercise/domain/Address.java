package io.jegan.com.spring3excercise.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
public class Address {

    private String streetNo;
    private String streetName;
    private int unitNo;
    private String City;
    private String postalcode;

    //
//    @Value("${address.streetNo}")
//    private String streetNo;
//    @Value("${address.streetName}")
//    private String streetName;
//    @Value("${address.unitNo}")
//    private int unitNo;
//    @Value("${address.city}")
//    private String city;
//    @Value("${address.postalcode}")
//    private String postalcode;
//    public Address(@Value("${address.streetNo}")String streetNo, @Value("${address.streetName}") String streetName,
//                   @Value("${address.unitNo}")int unitNo, @Value("${address.city}") String city,
//                   @Value("${address.postalcode}") String postalcode) {
//        this.streetNo = streetNo;
//        this.streetName = streetName;
//        this.unitNo = unitNo;
//        City = city;
//        this.postalcode = postalcode;

    public Address(String streetNo, String streetName, int unitNo, String city, String postalcode) {
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.unitNo = unitNo;
        City = city;
        this.postalcode = postalcode;
    }
}

