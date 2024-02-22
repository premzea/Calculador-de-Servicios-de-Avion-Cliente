import java.util.Scanner;

public class Manager{

    public static void main(String[] x){
        double LugggageWeight;
        int TravelType, NumberofPassengers;

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a travel type between travelling alone (1) or travelling with friends (2): ")
        TravelType = sc.getInt();
        System.out.println("Luggage Weight: ");
        LugggageWeight = sc.getDouble();
        NumberofPassengers = TravelType == 1 ? 1:3;

        if (NumberofPassengers == 1) {

        }
        else if (NumberofPassengers == 3){
            String [] Passengers = [];
            for (int i = 1; i < NumberofPassengers; i++){
                System.out.println("Well do Passengers" + i + "package calculations \n");
                System.out.println("What's your name? ")
                String Passenger = sc.nextString();
                Passengers.add(Passenger);
                Integer[] PackagePrices = PackageCalculations();
            }
        }

    }

    public static Integer[] PackageCalculations(){
        Integer XSPackagePrice, SPackagePrice, MPackagePrice;
        List <Integer> PackagePrices = [];
        XSPackagePrice = 175000;
        PackagePrices.add(XSPackagePrice);
        SPackagePrice = (Integer) XSPackagePrice + (XSPackagePrice * 0.25);
        PackagePrices.add(SPackagePrice);
        MPackagePrice = (Integer) SPackagePrice + (SPackagePrice * 0.30);
        PackagePrices.add(MPackagePrice);
        
    }

    
}