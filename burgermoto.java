import java.util.Scanner;

public class burgermoto {
    
    public static void main(String[] args) {
        
        Scanner potlog = new Scanner(System.in);
        
        int orderofBK, orderofBQ, orderofPrince; 
        String name;
        double money, change; 
        double discountedPrice;
        double normalPrice;
        double burgerKingPrice = 145.75; 
        double burgerQueenPrice = 126.00; 
        double burgerPrincePrice = 95.00;
        double totalAmount;

        System.out.println("\n------------------------------B-U-R-G-E-R-M-O-T-O------------------------------");
        System.out.print("Please enter your name: ");
        name = potlog.nextLine();

        System.out.println("\nENTER HOW MANY BURGERS DO YOU WANT\n");
        
        System.out.print("Burger King: ");
        orderofBK = potlog.nextInt();

        System.out.print("Burger Queen: ");
        orderofBQ = potlog.nextInt();

        System.out.print("Burger Prince: ");
        orderofPrince = potlog.nextInt();

        normalPrice = orderofBK * burgerKingPrice;
        discountedPrice = normalPrice * 0.05;
        totalAmount = (normalPrice - discountedPrice) + (orderofBQ * burgerQueenPrice) + (orderofPrince * burgerPrincePrice);

        System.out.println("\n------------------------------B-U-R-G-E-R-M-O-T-O------------------------------");
        System.out.println("\nHello! " + name + ".\n");

        System.out.println("Here are your orders.");
        System.out.println("Burger King: " + orderofBK + " orders.");
        System.out.println("Burger Queen: " + orderofBQ + " orders.");
        System.out.println("Burger Prince: " + orderofPrince + " orders.\n");
        System.out.println("------------------------------B-U-R-G-E-R-M-O-T-O------------------------------");

        System.out.println("\nYour Total Bill: " + totalAmount);

        System.out.print("Enter your Money: ");
        money = potlog.nextDouble();
        
        change = (money - totalAmount);

        System.out.println("Your Change: " + change);
        System.out.println("\n------------------------------B-U-R-G-E-R-M-O-T-O------------------------------");
        potlog.close();
    }
}
