package com.credmarg.controller;

import com.credmarg.Models.Vendor;
import com.credmarg.service.EmailService;
import com.credmarg.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
public class VendorController {
    @Autowired
    private VendorService vendorService;
    @Autowired
    private EmailService emailService;

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.createVendor(vendor);
    }

    @GetMapping
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    @PostMapping("/send-email")
    public void sendEmails() {
        List<Vendor> vendors = vendorService.getAllVendors();
        emailService.sendEmails(vendors);
    }
}
