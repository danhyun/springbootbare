package com.ahalife.cron;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

/**
 * Created with IntelliJ IDEA.
 * User: danielhyun
 * Date: 12/4/13
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */

public class Cron implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {

        // parse arguments

        // load beans

        //execute

    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run("classpath:/META-INF/application-context.xml", args);
    }
}