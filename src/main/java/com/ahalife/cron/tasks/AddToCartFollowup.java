package com.ahalife.cron.tasks;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: danielhyun
 * Date: 12/4/13
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */

@Service("ahaAddToCartFollowup")
public class AddToCartFollowup implements Task {



    @Override
    public void run() {

        System.out.println("I am running addtoCart");


    }
}
