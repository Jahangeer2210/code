package com.credmarg.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "vendors")
public class Vendor {
    @Id
    private String id;
    private String name;
    private String email;
    private String upi;
}
