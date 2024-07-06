package com.credmarg.controller;

import com.credmarg.Models.EmailLog;
import com.credmarg.service.EmailLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/email-logs")
public class EmailLogController {
    @Autowired
    private EmailLogService emailLogService;

    @GetMapping
    public List<EmailLog> getAllEmailLogs() {
        return emailLogService.getAllEmailLogs();
    }
}
