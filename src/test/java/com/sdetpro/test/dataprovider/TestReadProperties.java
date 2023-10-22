package com.sdetpro.test.dataprovider;

import com.sdetpro.data.LoginInfo;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

public class TestReadProperties {
    @Test
    public void testReadValidData(){
        LoginInfo loginInfo = ConfigFactory.create(LoginInfo.class);
        System.out.println(loginInfo.username());
        System.out.println(loginInfo.password());

    }
    @Test
    public void testReadInvalidData(){
        LoginInfo loginInfo = ConfigFactory.create(LoginInfo.class);
        System.out.println(loginInfo.usernameInvalid());
        System.out.println(loginInfo.passwordInvalid());

    }
}
