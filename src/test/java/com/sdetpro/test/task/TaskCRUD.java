package com.sdetpro.test.task;

import org.testng.annotations.Test;

public class TaskCRUD {
    @Test(groups = {"smoke"})
    public void checkGeneralUITaskCRUD(){
        System.out.println("checkGeneralUITaskCRUD -Smoke test");
    }
    @Test(groups = {"regression"})
    public void loginWithCorrectCredsTaskCRUD(){
        System.out.println("loginWithCorrectCredsTaskCRUD -funtion test");
    }
}
