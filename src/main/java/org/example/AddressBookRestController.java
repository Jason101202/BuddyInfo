package org.example;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/addressBook")
public class AddressBookRestController {

    private final AddressBookRepo repo;

    public AddressBookRestController(AddressBookRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public AddressBook getAddressBook() {
        if (repo.count() == 0) {
            return null; // No address book yet
        }
        return repo.findById(1L); // Return the only one
    }

    @PostMapping
    public AddressBook createAddressBook(@RequestBody AddressBook book) {
        if (repo.count() == 0) {
            return repo.save(book);
        }
        // Only one address book allowed — return existing
        return repo.findById(1L);
    }
}

