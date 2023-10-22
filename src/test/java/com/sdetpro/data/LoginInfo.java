package com.sdetpro.data;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:LoginData.properties",
"classpath:LoginDataInvalid.properties"})
public interface LoginInfo extends Config {
    String username();
    String password();
    String usernameInvalid();
    String passwordInvalid();

}
