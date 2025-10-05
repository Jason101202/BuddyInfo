package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class BuddyInfoJPARun {
    private static final Logger log = LoggerFactory.getLogger(BuddyInfoJPARun.class);

    public static void main(String[] args) {
        SpringApplication.run(BuddyInfoJPARun.class, args);
    }

    /*
    @Bean
    public CommandLineRunner demo(AddressBookRepo repo) {
        return (args) -> {
            BuddyInfo buddyInfo = new BuddyInfo();
            BuddyInfo buddyInfo1 = new BuddyInfo();
            buddyInfo.setName("bud");buddyInfo.setAddress("addr");buddyInfo.setPhoneNumber("1234");
            buddyInfo1.setName("bud1");buddyInfo1.setAddress("addr1");buddyInfo1.setPhoneNumber("1235");
            AddressBook abt1 = new AddressBook();
            abt1.addBuddy(buddyInfo);abt1.addBuddy(buddyInfo1);
            System.out.println(abt1.toString());

            repo.save(abt1);


            log.info("Addressbook found by Id:");
            log.info("--------------------------------");
            log.info(abt1.getId() + "");
            log.info(repo.findById(1L).toString());

        };
    }

     */
}
