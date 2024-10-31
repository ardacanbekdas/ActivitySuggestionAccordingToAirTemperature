package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class ActivitySuggestionAccordingToAirTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Please enter the air temperature: ");
        heat = input.nextInt();

        if (heat > 35 || heat < -8) {
            System.out.println("Don't leave from your house.");
            return;
        }

        if (heat <= 5) {
            System.out.println("You can go skiing.");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("You can go to the cinema.");
            }
            if (heat >= 10 && heat <= 20) {
                System.out.println("You can go for a run");
            }
            if (heat >= 15) {
                System.out.println("You can go on a picnic");
            }
        }
        else {
            System.out.println("You can go swimming");
        }
    }
}


/*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 10 ve 20 arasında ise "Koşu" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/
