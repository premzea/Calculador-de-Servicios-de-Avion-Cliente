import java.util.Scanner;

public class Manager{

    public static void main(String[] x){
        int LugggageWeight;
        int TravelType, NumberofPassengers, recommendationPrice;
        String SelectedPackage;

        // data
        int price10kg = 50000;
        int price23kg = 100000; 


        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a travel type between travelling alone (1) or travelling with friends (2): ");
        TravelType = sc.nextInt();
        System.out.println("Luggage Weight (Kg): ");
        LugggageWeight = sc.nextDouble();
        NumberofPassengers = TravelType == 1 ? 1:3;
        Integer[] PackagePrices = new Integer[3];
        PackagePrices = PackageCalculations();
        System.out.println(PackagePrices);
        String recommendation;
        if (NumberofPassengers == 1) {
            if (LugggageWeight == 3 || LugggageWeight == 13 || LugggageWeight == 36){
                if (LugggageWeight == 3){
                    recommendation = "XS Package";
                } else if (LugggageWeight == 13){
                    recommendation = "S Package";
                } else if (LugggageWeight == 36){
                    recommendation = "M Package";
                }
            } else if (LugggageWeight > 3 && LugggageWeight < 36){
                if (LugggageWeight > 36 - )
                for (i = 0; i < 3; i++){
                    int weight = LugggageWeight;
                    weight = LugggageWeight - 3 - 10*i;
                    if (weight = 0){
                        break;
                    }
                }
                recommendation = "XS Package with an addition of " + i + "10kg bags";
                recommendationPrice = PackagePrices[0] + i*price10kg;
            }
            } else if (LugggageWeight > 13 && LugggageWeight < 36){
                for (i = 0; i < 3; i++){
                    int weight = LugggageWeight;
                    weight = LugggageWeight - 3 - 10*i;
                    if (weight = 0){
                        break;
                    }



            System.out.println("We recommend you purchase the " + recommendation + "so you can take all your luggage, for a price of " + recommendationPrice);
            System.out.println("which package are you purchasing? \n");
            SelectedPackage = sc.nextString();
        }
        else if (NumberofPassengers == 3){
            String[] Passengers = new String[3];
            
            for (int i = 0; i < NumberofPassengers; i++){
                System.out.println("Well do Passengers" + (i+1) + "package calculations \n");
                System.out.println("What's your name? ");
                String Passenger = sc.next();
                Passengers[i] = (Passenger);
                
            }
        }

    }

    public static Integer[] PackageCalculations(){
        Integer XSPackagePrice, SPackagePrice, MPackagePrice;
        Integer[] PackagePrices = new Integer[3];
        XSPackagePrice = 175000;
        PackagePrices[0] = XSPackagePrice;
        SPackagePrice = (Integer) XSPackagePrice + (XSPackagePrice * 0.25);
        PackagePrices[1]= SPackagePrice;
        MPackagePrice = (Integer) SPackagePrice + (SPackagePrice * 0.30);
        PackagePrices[2] = MPackagePrice;
        
    }

    
}