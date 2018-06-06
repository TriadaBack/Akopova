import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test(priority = 1)
    public void testGroupCreationLongName() {

        goToGroupsPage();
        initGroupCreation();
        fillGroupForm("Name", "Header", "Footer");
        submitGroupCreation();
        returnToGroupsPage();
        System.out.println("testGroupCreationLongName()passed");
    }


    @Test(priority = 2)
    public void testGroupCreationShortName() {

        goToGroupsPage();
        initGroupCreation();
        fillGroupForm("N", "H", "F");
        submitGroupCreation();
        returnToGroupsPage();
        System.out.println("testGroupCreationShortName()passed");
    }

    @Test(priority = 3)
    public void testGroupCreationEmpty() {

        goToGroupsPage();
        initGroupCreation();
        fillGroupForm("", "", "");
        submitGroupCreation();
        returnToGroupsPage();
    }
}
