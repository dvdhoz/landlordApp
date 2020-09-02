import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LandlordAppTest {
    @Test
    void testCompute() {
        double utilityBillValue = 200;
        int occupants = 4;
        double result = LandlordApp.computeRenterRate(utilityBillValue,occupants);
        assertEquals(50,result);
    }
    @Test
    void testComputezerooccupants() {
        double utilityBillValue = 200;
        int occupants = 0;
        double result = LandlordApp.computeRenterRate(utilityBillValue,occupants);
        assertEquals(0,result);
    }
    @Test
    void testComputenegativeoccupants() {
        double utilityBillValue = 200;
        int occupants = -1;
        double result = LandlordApp.computeRenterRate(utilityBillValue,occupants);
        assertEquals(0,result);
    }
    @Test
    void testComputenegativebill() {
        double utilityBillValue = -200;
        int occupants = 1;
        double result = LandlordApp.computeRenterRate(utilityBillValue,occupants);
        assertEquals(0,result);
    }
}