package com.tr.exmpl;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.start();
        app.openAddressbook("http://localhost/addressbook/");
        app.login("admin","secret");
    }

    public void submitConactCreating() {
        app.getGroupHelper().driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void addPrivateInfo(String kosvennaya, String phone2, String notes) {

        app.getGroupHelper().driver.findElement(By.name("address2")).click();
        app.getGroupHelper().driver.findElement(By.name("address2")).clear();
        app.getGroupHelper().driver.findElement(By.name("address2")).sendKeys(kosvennaya);
        app.getGroupHelper().driver.findElement(By.name("theform")).click();
        app.getGroupHelper().driver.findElement(By.name("phone2")).click();
        app.getGroupHelper().driver.findElement(By.name("phone2")).clear();
        app.getGroupHelper().driver.findElement(By.name("phone2")).sendKeys(phone2);
        app.getGroupHelper().driver.findElement(By.name("notes")).click();
        app.getGroupHelper().driver.findElement(By.name("notes")).clear();
        app.getGroupHelper().driver.findElement(By.name("notes")).sendKeys(notes);
    }

    public void selectContactGroup(String name) {
        app.getGroupHelper().driver.findElement(By.name("new_group")).click();
        new Select(app.getGroupHelper().driver.findElement(By.name("new_group"))).selectByVisibleText(name);
        app.getGroupHelper().driver.findElement(By.name("new_group")).click();
        app.getGroupHelper().driver.findElement(By.name("theform")).click();
    }

    public void addBDay(String bday, String month, String byear ) {
        app.getGroupHelper().driver.findElement(By.name("bday")).click();
        new Select(app.getGroupHelper().driver.findElement(By.name("bday"))).selectByVisibleText( bday);
        app.getGroupHelper().driver.findElement(By.name("bday")).click();
        app.getGroupHelper().driver.findElement(By.name("bmonth")).click();
        new Select(app.getGroupHelper().driver.findElement(By.name("bmonth"))).selectByVisibleText(month);
        app.getGroupHelper().driver.findElement(By.name("bmonth")).click();
        app.getGroupHelper().driver.findElement(By.name("byear")).click();
        app.getGroupHelper().driver.findElement(By.name("byear")).clear();
        app.getGroupHelper().driver.findElement(By.name("byear")).sendKeys(byear);
        app.getGroupHelper().driver.findElement(By.name("theform")).click();
    }

    public void fillCompanyInfo(String cabaret_amsterdam_, String devolanovskiy_spusk, String mobile, String email) {
        app.getGroupHelper().driver.findElement(By.name("company")).click();
        app.getGroupHelper().driver.findElement(By.name("company")).clear();
        app.getGroupHelper().driver.findElement(By.name("company")).sendKeys(cabaret_amsterdam_);
        app.getGroupHelper().driver.findElement(By.name("theform")).click();
        app.getGroupHelper().driver.findElement(By.name("address")).click();
        app.getGroupHelper().driver.findElement(By.name("address")).clear();
        app.getGroupHelper().driver.findElement(By.name("address")).sendKeys(devolanovskiy_spusk);
        app.getGroupHelper().driver.findElement(By.name("mobile")).click();
        app.getGroupHelper().driver.findElement(By.name("mobile")).clear();
        app.getGroupHelper().driver.findElement(By.name("mobile")).sendKeys(mobile);
        app.getGroupHelper().driver.findElement(By.name("theform")).click();
        app.getGroupHelper().driver.findElement(By.name("email")).click();
        app.getGroupHelper().driver.findElement(By.name("email")).clear();
        app.getGroupHelper().driver.findElement(By.name("email")).sendKeys(email);
        app.getGroupHelper().driver.findElement(By.name("theform")).click();
    }

    public void addNewContact(String ilana, String prokofiev, String innocent_devil, String dancer) {
        app.getGroupHelper().driver.findElement(By.name("firstname")).click();
        app.getGroupHelper().driver.findElement(By.name("firstname")).clear();
        app.getGroupHelper().driver.findElement(By.name("firstname")).sendKeys(ilana);
        app.getGroupHelper().driver.findElement(By.name("lastname")).click();
        app.getGroupHelper().driver.findElement(By.name("lastname")).clear();
        app.getGroupHelper().driver.findElement(By.name("lastname")).sendKeys(prokofiev);
        app.getGroupHelper().driver.findElement(By.name("nickname")).click();
        app.getGroupHelper().driver.findElement(By.name("nickname")).clear();
        app.getGroupHelper().driver.findElement(By.name("nickname")).sendKeys(innocent_devil);
        app.getGroupHelper().driver.findElement(By.name("title")).click();
        app.getGroupHelper().driver.findElement(By.name("title")).clear();
        app.getGroupHelper().driver.findElement(By.name("title")).sendKeys(dancer);
    }


    public void contactCreation() {
        app.getGroupHelper().driver.findElement(By.linkText("add new")).click();
    }

    public void openSite() {
        app.openAddressbook();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }
}
