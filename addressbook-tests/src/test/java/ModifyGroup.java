import com.tr.exmpl.GroupData;
import com.tr.exmpl.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ModifyGroup extends TestBase {
    @Test
    public void groupModificationTests() {
        app.goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initModifyGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("1", "1", ""));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before+1); //111111111111111111111111111111111
    }

}
