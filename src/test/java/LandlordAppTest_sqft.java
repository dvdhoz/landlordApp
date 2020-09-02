import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LandlordAppTest_sqft {
    @Test
    void testCompute() {
        double utilityBillValue = 200;
        double perSqFt = 1.0;
        double result = LandlordApp_sqft.computeRenterRate(utilityBillValue,perSqFt);
        assertEquals(200,result);
    }
    @Test
    void testComputezerooccupants() {
        double utilityBillValue = 200;
        double perSqFt = 0;
        double result = LandlordApp_sqft.computeRenterRate(utilityBillValue,perSqFt);
        assertEquals(0,result);
    }
    @Test
    void testComputenegativeoccupants() {
        double utilityBillValue = 200;
        double perSqFt = -1;
        double result = LandlordApp_sqft.computeRenterRate(utilityBillValue,perSqFt);
        assertEquals(0,result);
    }
    @Test
    void testComputenegativebill() {
        double utilityBillValue = -200;
        double perSqFt = 3;
        double result = LandlordApp_sqft.computeRenterRate(utilityBillValue, perSqFt);
        double a = LandlordApp_sqft.pi;
        LandlordApp_sqft b = new LandlordApp_sqft();
        double c = b.twopi;
        double d = b.getThreepi();

        assertEquals(0,result);
    }
}