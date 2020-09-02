public class LandlordApp {
    public static void main(String args[]){
        System.out.println("Hello World");
        double utilityBillValue = 400;
        int occupants = 2;
        double pricePerOccupant = computeRenterRate(utilityBillValue,occupants);
        System.out.println("the utility bill for this month " + pricePerOccupant);
    }

    public static double computeRenterRate(double utilityBillValue, int occupants) {
        if (occupants <= 0) {
            return 0;
        }
        if (utilityBillValue <= 0) {
            return 0;
        }
        return utilityBillValue/occupants;
    }
}
