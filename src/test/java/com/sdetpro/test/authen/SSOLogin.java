package com.sdetpro.test.authen;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SSOLogin {

    @Ignore
    @Test(groups = {"regression"})
    public void anExistingMethod(){
//        System.out.println("anExistingMethod - funtin test");
//       throw  new SkipException(".................");
        System.out.println("Step 01");
        System.out.println("Step 02");

    }

    @Test(groups = {"regression"})
    public void anExistingMethod2(){
        System.out.println("anExistingMethod - funtin test");
       throw  new SkipException(".................");


    }
    @Test(groups = {"smoke"})
    public void checkGeneralUISSOLogin(){
        System.out.println("checkGeneralUISSOLogin -Smoke test");
    }
    @Test(groups = {"regression"})
    public void loginWithCorrectCredsSSOLogin(){
        System.out.println("loginWithCorrectCredsSSOLogin -funtion test");
    }
}
