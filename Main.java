import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("WHAT ITEM ARE YOU GETTING?: ");
        String itemName = sc.nextLine();

        System.out.print("HOW MUCH IS IT?: ");
        double price = sc.nextDouble();

        System.out.print("HOW MANY WILL YOU BE PURCHASING?: ");
        int quantity = sc.nextInt();

        double total = price * quantity;

        FileWriter writer = new FileWriter("receipt.txt");

        writer.write("ITEM: " + itemName + "\n");
        writer.write("PRICE: $" + price + "\n");
        writer.write("QUANTITY: " + quantity + "\n");
        writer.write("TOTAL: $" + String.format("%.2f", total) + "\n");

        writer.close();
        System.out.println("RECEIPT SAVED!");

        sc.close();
    }
}