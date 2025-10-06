package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class AddressBookController {
    // we beed to update this
    private final AddressBookRepo repo;

    public AddressBookController(AddressBookRepo repo) {
        this.repo = repo;
    }
    @GetMapping("/display")
    public String displayAddressBook(Model model){
        AddressBook a = repo.findById(1);
        String buddies = a.getBuddies().toString();
        model.addAttribute("addressBookBuds", buddies);
        return "DisplayAB";

    }
    /*
    @GetMapping("/display")
    public AddressBook addressBook(@RequestParam(defaultValue = "addressbook") String name, AddressBookRepo repo) {
        AddressBook a = new AddressBook();
        repo.save(a);
        return a;
    }

    @GetMapping("/addBuddy")
    public AddressBook addBud(@RequestParam(defaultValue = "addressbook") String name) {


        return repos.findById(1L).addBuddy();
    }

    @GetMapping("/addBuddy")
    public AddressBook remBud(@RequestParam(defaultValue = "addressbook") String name, AddressBookRepo repo) {
        return repo.findById(1L);
    }
    */

}
