package com.tr.exmpl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test(priority = 1)
    public void testGroupCreationLongName() {

        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("Name", "Header", "Footer"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
        int after = app.getGroupCount();
        Assert.assertEquals(after,before+1);
        //System.out.println("testGroupCreationLongName()passed");
    }


    @Test(priority = 2)
    public void testGroupCreationShortName() {


        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("N", "H", "F"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
        Assert.assertEquals(after, before+1);
        //System.out.println("testGroupCreationShortName()passed");
    }

    @Test(priority = 3, enabled = false)
    public void testGroupCreationEmpty() {

        app.goToGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("", "", ""));
        app.submitGroupCreation();
        app.returnToGroupsPage();
    }
}
