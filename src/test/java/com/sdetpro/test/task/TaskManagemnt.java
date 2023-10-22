package com.sdetpro.test.task;

import org.testng.annotations.Test;

public class TaskManagemnt {

    @Test(groups = {"smoke"})
    public void checkGeneralUITaskManagemnt(){
        System.out.println("checkGeneralUITaskManagemnt-Smoke test");
    }
    @Test(groups = {"regression"})
    public void loginWithCorrectCredsTaskManagemnt(){
        System.out.println("loginWithCorrectCredsTaskManagemnt -funtion test");
    }
}
