package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuddyInfoController {

    private final BuddyInfoRepo repo;

    public BuddyInfoController(BuddyInfoRepo repo) {
        this.repo = repo;
    }

    @PostMapping("/buddyInfo")
    public BuddyInfo addBuddy(@RequestBody BuddyInfo buddy) {
        return repo.save(buddy);
    }

    @GetMapping("/buddyInfo")
    public Iterable<BuddyInfo> getAllBuddies() {
        return repo.findAll();
    }
}
