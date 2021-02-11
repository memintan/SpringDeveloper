package com.cybertek.bootstrap;

import com.cybertek.entity.Address;
import com.cybertek.entity.Person;
import com.cybertek.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Halil", "Tan");
        Person p2 = new Person("Mehmet", "Emin");
        Person p3 = new Person("Fatih", "Ibrahim");

        Address a1 = new Address("Hidden Lake", "77406");
        Address a2 = new Address("Emerald Run", "77359");
        Address a3 = new Address("Peek", "77449");

        p1.setAddresses(Arrays.asList(a1,a2));
        personRepository.save(p1);

    }
}
