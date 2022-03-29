package io.jegan.com.spring3excercise;

import io.jegan.com.spring3excercise.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring3excerciseApplication {

    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(Spring3excerciseApplication.class, args);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

}
