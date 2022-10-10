import data.Human;
import driverConfig.BaseClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import sql.StatemenT;
import util.WatcherByClassTest;

import java.sql.SQLException;
import java.util.List;

public class TestDB extends BaseClass {
    @Rule
   public WatcherByClassTest watcherByClassTest= new WatcherByClassTest();
    static StatemenT statemenT=null;
    @BeforeClass
    public static void createUser() throws SQLException{
        statemenT=new StatemenT();
    }

    @Test
    public void testSelect() throws SQLException {
        Human human=statemenT.selectFromId("5874");
        Assert.assertEquals("fdsffg",human.getName());
    }
    @Test
    public void updPassword(){
        Human human=statemenT.UpdatePassword("updatedPassword1","21445jhkjk");

    }
    @Test
    public void checkTheSameEmails() throws SQLException {
        List<Human> human= statemenT.selectListByEmail("clackkent@yahoo.com");
        System.out.println(human.toString());
    }
}
