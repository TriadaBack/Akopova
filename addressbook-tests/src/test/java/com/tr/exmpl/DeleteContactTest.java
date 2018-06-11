package com.tr.exmpl;

import org.testng.annotations.Test;

   public class DeleteConactTest extends  TestBase{
        //@Test
       // public void cdeletionContactTest {
        //    app.selectContact();
      //      app.deleteContact();
        //    app.confirmAlert();
       // }
  //  }
       @Test
       public void contactDeletionTest(){
          app.selectContact();
          app.initConactDeletion();
           app.accertAllert();
       }
}
