package com.credmarg.service;

import com.credmarg.Models.EmailLog;
import com.credmarg.repository.EmailLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class EmailLogService {
    @Autowired
    private EmailLogRepository emailLogRepository;

    public EmailLog saveEmailLog(String vendorName, String vendorEmail, String upi, String message) {
        EmailLog emailLog = new EmailLog();
        emailLog.setVendorName(vendorName);
        emailLog.setVendorEmail(vendorEmail);
        emailLog.setUpi(upi);
        emailLog.setMessage(message);
        emailLog.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        return emailLogRepository.save(emailLog);
    }

    public List<EmailLog> getAllEmailLogs() {
        return emailLogRepository.findAll();
    }
}
