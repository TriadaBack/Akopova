package com.tr.exmpl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test(priority = 1)
    public void testGroupCreationLongName() {

        app.goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Name", "Header", "Footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before+1);
        //System.out.println("testGroupCreationLongName()passed");
    }


    @Test(priority = 2)
    public void testGroupCreationShortName() {


        app.goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("N", "H", "F"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();
        Assert.assertEquals(after, before+1);
        //System.out.println("testGroupCreationShortName()passed");
    }

    @Test(priority = 3, enabled = false)
    public void testGroupCreationEmpty() {

        app.goToGroupsPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("", "", ""));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();
    }
}
