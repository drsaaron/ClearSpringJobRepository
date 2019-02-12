/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.utils.clearspringjobrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author scott
 */
@SpringBootApplication
@ImportResource("classpath:SpringXMLConfig.xml")
@ComponentScan("com.blazartech")
@EnableAutoConfiguration(exclude={BatchAutoConfiguration.class})
public class Main {
    
    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
    }
}
