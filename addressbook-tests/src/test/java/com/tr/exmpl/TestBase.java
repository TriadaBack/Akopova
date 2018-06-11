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
        app.driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void addPrivateInfo(String kosvennaya, String phone2, String notes) {

        app.driver.findElement(By.name("address2")).click();
        app.driver.findElement(By.name("address2")).clear();
        app.driver.findElement(By.name("address2")).sendKeys(kosvennaya);
        app.driver.findElement(By.name("theform")).click();
        app.driver.findElement(By.name("phone2")).click();
        app.driver.findElement(By.name("phone2")).clear();
        app.driver.findElement(By.name("phone2")).sendKeys(phone2);
        app.driver.findElement(By.name("notes")).click();
        app.driver.findElement(By.name("notes")).clear();
        app.driver.findElement(By.name("notes")).sendKeys(notes);
    }

    public void selectContactGroup(String name) {
        app.driver.findElement(By.name("new_group")).click();
        new Select(app.driver.findElement(By.name("new_group"))).selectByVisibleText(name);
        app.driver.findElement(By.name("new_group")).click();
        app.driver.findElement(By.name("theform")).click();
    }

    public void addBDay(String bday, String month, String byear ) {
        app.driver.findElement(By.name("bday")).click();
        new Select(app.driver.findElement(By.name("bday"))).selectByVisibleText( bday);
        app.driver.findElement(By.name("bday")).click();
        app.driver.findElement(By.name("bmonth")).click();
        new Select(app.driver.findElement(By.name("bmonth"))).selectByVisibleText(month);
        app.driver.findElement(By.name("bmonth")).click();
        app.driver.findElement(By.name("byear")).click();
        app.driver.findElement(By.name("byear")).clear();
        app.driver.findElement(By.name("byear")).sendKeys(byear);
        app.driver.findElement(By.name("theform")).click();
    }

    public void fillCompanyInfo(String cabaret_amsterdam_, String devolanovskiy_spusk, String mobile, String email) {
        app.driver.findElement(By.name("company")).click();
        app.driver.findElement(By.name("company")).clear();
        app.driver.findElement(By.name("company")).sendKeys(cabaret_amsterdam_);
        app.driver.findElement(By.name("theform")).click();
        app.driver.findElement(By.name("address")).click();
        app.driver.findElement(By.name("address")).clear();
        app.driver.findElement(By.name("address")).sendKeys(devolanovskiy_spusk);
        app.driver.findElement(By.name("mobile")).click();
        app.driver.findElement(By.name("mobile")).clear();
        app.driver.findElement(By.name("mobile")).sendKeys(mobile);
        app.driver.findElement(By.name("theform")).click();
        app.driver.findElement(By.name("email")).click();
        app.driver.findElement(By.name("email")).clear();
        app.driver.findElement(By.name("email")).sendKeys(email);
        app.driver.findElement(By.name("theform")).click();
    }

    public void addNewContact(String ilana, String prokofiev, String innocent_devil, String dancer) {
        app.driver.findElement(By.name("firstname")).click();
        app.driver.findElement(By.name("firstname")).clear();
        app.driver.findElement(By.name("firstname")).sendKeys(ilana);
        app.driver.findElement(By.name("lastname")).click();
        app.driver.findElement(By.name("lastname")).clear();
        app.driver.findElement(By.name("lastname")).sendKeys(prokofiev);
        app.driver.findElement(By.name("nickname")).click();
        app.driver.findElement(By.name("nickname")).clear();
        app.driver.findElement(By.name("nickname")).sendKeys(innocent_devil);
        app.driver.findElement(By.name("title")).click();
        app.driver.findElement(By.name("title")).clear();
        app.driver.findElement(By.name("title")).sendKeys(dancer);
    }


    public void contactCreation() {
        app.driver.findElement(By.linkText("add new")).click();
    }

    public void openSite() {
        app.openAddressbook();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }
}
