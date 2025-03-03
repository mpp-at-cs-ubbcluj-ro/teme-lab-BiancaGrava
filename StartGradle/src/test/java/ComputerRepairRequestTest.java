import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerRepairRequestTest {

    @Test
    @DisplayName("Test Empty Case")
    public void testExample(){
        ComputerRepairRequest crr = new ComputerRepairRequest();
        assertEquals("", crr.getOwnerName());
        assertEquals("", crr.getOwnerAddress());
    }

    @Test
    @DisplayName("Test getAndSetName")
    public void testGetAndSetName(){
        ComputerRepairRequest crr = new ComputerRepairRequest();
        crr.setOwnerName("testOwner");
        assertEquals("testOwner", crr.getOwnerName());
    }

    @Test
    @DisplayName("Test getAndSetAdr")
    public void testGetAndSetAdr(){
        ComputerRepairRequest crr = new ComputerRepairRequest();
        crr.setOwnerAddress("testAdr");
        assertEquals("testAdr", crr.getOwnerAddress());
    }

    @Test
    @DisplayName("Test ToStringMethod")
    public void testToString(){
        ComputerRepairRequest crr = new ComputerRepairRequest();
        crr.setOwnerName("testOwner");
        crr.setOwnerAddress("testAdr");
        crr.setModel("testModel");
        crr.setID(12);
        crr.setDate("dateTest");
        crr.setProblemDescription("testProblemDescription");
        assertEquals("ID=12, ownerName='testOwner', model='testModel', date='dateTest', problemDescription='testProblemDescription'", crr.toString());
        System.out.println(crr.toString());
    }
}
