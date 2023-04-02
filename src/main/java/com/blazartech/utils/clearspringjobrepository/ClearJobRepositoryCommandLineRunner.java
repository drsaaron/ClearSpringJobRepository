/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blazartech.utils.clearspringjobrepository;

import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.test.JobRepositoryTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author scott
 */
@Component
public class ClearJobRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ClearJobRepositoryCommandLineRunner.class);
    
    @Autowired
    private JobRepository jobRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("clearing job repository");
        
        JobRepositoryTestUtils testUtils = new JobRepositoryTestUtils(jobRepository);
        testUtils.removeJobExecutions();
    }
    
}
