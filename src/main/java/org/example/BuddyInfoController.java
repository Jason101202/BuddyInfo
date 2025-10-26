package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
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

    @GetMapping("/displayB")
    public String displayBud(Model model) {
        String fakeBuddy = "FakeahhBuddy";
        model.addAttribute("buddy", fakeBuddy);
        return "displayBuds";

    }
}
