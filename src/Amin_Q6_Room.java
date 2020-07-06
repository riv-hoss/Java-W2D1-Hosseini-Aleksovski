public class Amin_Q6_Room {
    int numberOfBeds;
    double pricePerNight;
    double basePrice  = 60.0;
    double extraBedPrice = 12.5;
    boolean isBooked;

    public Amin_Q6_Room(int numberOfBeds, boolean isBooked) {
        if(numberOfBeds == 1){
            this.pricePerNight = basePrice;
        } else if (numberOfBeds > 1 && numberOfBeds <5){
            this.pricePerNight = basePrice + extraBedPrice * numberOfBeds;
        } else {
            System.err.printf("%d is not a valid number of beds! Please choose between 1 and 4.", numberOfBeds);
            return;
        }

    }

    public String roomBooked () {
        if (isBooked == true){
            return "Yes";
        } else {
            return "No";

        }
    }


}
