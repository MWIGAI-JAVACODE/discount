// Name: JENTRIX MWIGAI
// Reg No: J77-11431-2024
//Description: Program to execute Discount
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        double discount;

        if (amount > 5000) {
            discount = amount * 0.10; // 10%
        } else if (amount > 1000 && amount <= 5000) {
            discount = amount * 0.05; // 5%
        } else {
            discount = 0; 
        }

        double finalAmount = amount - discount;

        System.out.println("Amount before discount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount after discount: " + finalAmount);
    }
}


