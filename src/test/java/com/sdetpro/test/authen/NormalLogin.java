package com.sdetpro.test.authen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalLogin {
    @Test(groups = {"smoke"})
    public void checkGeneralUI(){
        System.out.println("checkGeneralUI -Smoke test");
    }
    @Test(groups = {"regression"})
    public void loginWithCorrectCreds(){
        Assert.fail("Masked the test failed for debugging");
        System.out.println("loginWithCorrectCreds -funtion test");
    }
}
