package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class AddressBookController {
    // we need to update this
    private final AddressBookRepo repo;

    public AddressBookController(AddressBookRepo repo) {
        this.repo = repo;
    }
    @GetMapping("/display")
    public String displayAddressBook(Model model){
        AddressBook a = repo.findById(1);
        if (a == null) {
            String testBuddies = "No buddies found";
            model.addAttribute("addressBookBuds", testBuddies);
            return "DisplayAB";
        }
        String buddies = a.getBuddies().toString();
        model.addAttribute("addressBookBuds", buddies);
        return "DisplayAB";

    }


    @GetMapping("/addressBook")
    public String formAddressBook(Model model){
        model.addAttribute("addressbook", new AddressBook());
        return "addressbookInteract";
    }

    @PostMapping("/addressBook")
    public String addAddressBook(@ModelAttribute AddressBook addressBook, Model model) {
        model.addAttribute("addressbook", addressBook);
        repo.save(addressBook);
        return "addressbookInteract";
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
