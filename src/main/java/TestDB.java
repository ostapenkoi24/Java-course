import data.Human;
import org.junit.BeforeClass;
import org.junit.Test;
import sql.StatemenT;

import java.sql.SQLException;
import java.util.List;

public class TestDB {
    static StatemenT statemenT=null;
    @BeforeClass
    public static void createUser() throws SQLException{
        statemenT=new StatemenT();
    }

    @Test
    public void testSelect() throws SQLException {
        Human human=statemenT.selectFromId("5874");
        System.out.println(human.getName());
    }
    @Test
    public void updPassword(){
        Human human=statemenT.UpdatePassword("updatedPassword1","21445");

    }
    @Test
    public void checkTheSameEmails() throws SQLException {
        List<Human> human= statemenT.selectListByEmail("clackkent@yahoo.com");
        System.out.println(human.toString());
    }
}
