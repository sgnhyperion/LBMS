package com.example.lbms.LMS.Controllers;

import com.example.lbms.LMS.Models.Lending;
import com.example.lbms.LMS.Service.LendingService;
import com.example.lbms.LMS.Service.LendingServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lendings")
public class LendingController {
    private LendingService lendingService;

    LendingController(LendingService lendingService) {
        this.lendingService = lendingService;
    }

    @GetMapping("/{id}")
    public Lending findById(@PathVariable long id) {
            return this.lendingService.findLendingById(id);
    }

    @GetMapping("/")
    public List<Lending> getAllActiveLendings(){
        return this.lendingService.getAllActiveLendings();
    }

    @PostMapping("/")
    public Lending addLending(@RequestBody Lending lending) {
        return this.lendingService.addLending(lending);
    }

    @PatchMapping("/{id}")
    public Lending updateLending(@PathVariable long id, @RequestBody Lending lending) {
        return this.lendingService.updateLending(id, lending);
    }

    @DeleteMapping("/{id}")
    public Lending deleteLending(@PathVariable long id) {
        return this.lendingService.deleteLending(id);
    }
}
