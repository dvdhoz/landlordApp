public class LandlordApp_sqft {
    public static void main(String args[]){
        System.out.println("Hello World");
        double utilityBillValue = 400;
        double perSqFt = .2;
        double pricePerOccupant = computeRenterRate(utilityBillValue,perSqFt);
        System.out.println("the utility bill for this month " + pricePerOccupant);
    }
public static double pi = 3.14;
    public double twopi = pi*2;
    private double threepi = pi*3;
    public static double computeRenterRate(double utilityBillValue, double perSqFt) {
        if (perSqFt <= 0) {
            return 0;
        }
        if (perSqFt > 1) {
            return 1;
        }
        if (utilityBillValue <= 0) {
            return 0;
        }
        return utilityBillValue*perSqFt;
    }

    public double getThreepi() {
        return threepi;
    }
}
