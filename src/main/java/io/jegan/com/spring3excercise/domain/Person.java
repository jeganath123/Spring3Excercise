package io.jegan.com.spring3excercise.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
public class Person {

    private String name;
    private Address address;

    public Person(String name,Address address) {
        this.name=name;
        this.address = address;
    }
}


