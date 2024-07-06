package com.credmarg.service;

import com.credmarg.Models.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
    @Autowired
    private EmailLogService emailLogService;

    public void sendEmails(List<Vendor> vendors) {
        for (Vendor vendor : vendors) {
            String message = String.format("Sending payments to vendor %s at upi %s", vendor.getName(), vendor.getUpi());
            System.out.println("Email to: " + vendor.getEmail());
            System.out.println("Message: " + message);
            emailLogService.saveEmailLog(vendor.getName(), vendor.getEmail(), vendor.getUpi(), message);
        }
    }
}
