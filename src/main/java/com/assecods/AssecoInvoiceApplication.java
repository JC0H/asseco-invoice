package com.assecods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class AssecoInvoiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssecoInvoiceApplication.class, args);
    }

}
