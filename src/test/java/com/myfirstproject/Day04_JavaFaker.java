package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day04_JavaFaker {


    @Test
    public void test1(){
  //create faker
  Faker faker = new Faker()  ;

  //
 String firstname = faker.name().firstName();
        System.out.println(firstname);

    String lastName=  faker.name().lastName();
        System.out.println(lastName);

        String username = faker.name().username();
        System.out.println(username);

      String title =   faker.name().title();
        System.out.println(title);

        String city = faker.address().city();
        System.out.println(city);

        String state =faker.address().state();
        System.out.println(state);

        String fullAddress = faker.address().fullAddress();
        System.out.println(fullAddress);

        String cellPhone = faker.phoneNumber().cellPhone();
        System.out.println(cellPhone);

        String email = faker.internet().emailAddress();
        System.out.println(email);

        String zip = faker.address().zipCode();
        System.out.println(zip);

        String zipCode = faker.number().digits(5);
        System.out.println(zipCode);


    }

}
