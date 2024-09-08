public class eggseller {
    
    public static void main(String[] args) {
        
        byte egg = 69, priceOfEggs = 110, priceOfExtraEggs = 10;
 
        int extraEggs = (egg%12);
        int dozenEggs = (egg - extraEggs) / 12;
        long totalAmount = (dozenEggs * priceOfEggs) + (extraEggs * priceOfExtraEggs);
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Eggs are Priced at $110 per dozen and for every egg added over a dozen is $10\n");
        System.out.println("Total Number of Eggs: " + egg);
        System.out.println("Total Price of all the eggs + extra: $" + totalAmount);
        System.out.println("-------------------------------------------------------------------------------");
    }
}
