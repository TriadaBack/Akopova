package com.tr.exmpl;

import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {

    @Test
    public void testContactCreating() {

        contactCreation();
        addNewContact("Ilana", "Prokofiev", "Innocent Devil","hfhsfus");
        fillCompanyInfo("Cabaret Amsterdam ", "Devolanovskiy spusk","0546033541", "danser.lada@gmail.com");
        addBDay("9","November", "1987");
        selectContactGroup("Name");
        addPrivateInfo("Kosvennaya", "0682522997","I'm amazing");
        submitConactCreating();
    }

}





