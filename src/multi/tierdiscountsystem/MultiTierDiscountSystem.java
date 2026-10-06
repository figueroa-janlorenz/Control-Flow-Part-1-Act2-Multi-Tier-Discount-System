package multi.tierdiscountsystem;

public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        
        double purchaseAmount = 5000;
        double discount = 0;
        
        if (purchaseAmount >= 5000) {
            discount = 0.15;
        } else if (purchaseAmount >= 3000) {
            discount = 0.10;
        } else if (purchaseAmount >= 1000) {
            discount = 0.05;
        } else {
            discount = 0;
        }
        
        double discountedPrice = purchaseAmount - (purchaseAmount * discount);
        
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Tier: " + (discount * 100 +"%"));
        System.out.println("Final Discount Price: " + discountedPrice);
     }
    
}
