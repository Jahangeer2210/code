package com.credmarg.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "email_logs")
public class EmailLog {
    @Id
    private String id;
    private String vendorName;
    private String vendorEmail;
    private String upi;
    private String message;
    private String timestamp;
}
