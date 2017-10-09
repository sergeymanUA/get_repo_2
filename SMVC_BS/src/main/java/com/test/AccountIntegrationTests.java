package com.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.smvc.bs.AccountService;

//import junit.framework.Assert;

/**
 * Created by Sergei on 05.10.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ch2-beans.xml")
public class AccountIntegrationTests {
	
	@Autowired
    private AccountService accountService;
    @Test
    public void accountServiceShouldBeInjected() {
        Assert.assertNotNull(accountService);
    }
}