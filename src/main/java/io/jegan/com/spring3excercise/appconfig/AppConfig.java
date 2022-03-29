package io.jegan.com.spring3excercise.appconfig;

import io.jegan.com.spring3excercise.domain.Address;
import io.jegan.com.spring3excercise.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${address.streetNo}")
    private String streetNo;
    @Value("${address.streetName}")
    private String streetName;
    @Value("${address.unitNo}")
    private int unitNo;
    @Value("${address.city}")
    private String city;
    @Value("${address.postalcode}")
    private String postalcode;
    @Value("${person.name}")
    private String name;
    @Bean
    public Person person(){
        return new Person(name,address());
    }
    @Bean
    public Address address(){
        Address address=new Address(streetNo, streetName, unitNo, city,postalcode);
        return address;
    }
}
