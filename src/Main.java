import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sumOddDigits = 0;
        int sumEvenDigits = 0;
        int total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a card number (Do not use spaces): ");
        String card = sc.next();
        card = card.replaceAll("-", "");

       String reverseCard = String.valueOf(new StringBuilder(card).reverse());

       for(int i = 0; i<reverseCard.length(); i+=2){
           sumOddDigits += Character.getNumericValue(reverseCard.charAt(i));
       }

        for(int i = 1; i<reverseCard.length(); i+=2) {
            int x = Character.getNumericValue(reverseCard.charAt(i))*2;
            if(x>=10){
                sumEvenDigits+= (1+(x%10));
            }
            else {
                sumEvenDigits +=x;
            }
        }

        total = sumEvenDigits + sumOddDigits;

        if (total%10 == 0){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}




