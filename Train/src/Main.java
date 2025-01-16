import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        List<Order> orders = new ArrayList<>();

        orders.add(new Order("Laptop", 899.99, 1));
        orders.add(new Order("Mouse", 19.99, 2));
        orders.add(new Order("Keyboard", 49.99, 1));

        for (Order order : orders) {
            total += order.getTotalOrder();
        }
        double discount = Discount.select_discount(total, 0);
        double[] totalAfterDiscount = Discount.apply_discount(total, discount);
        double finalTotal = totalAfterDiscount[1];
        double amountDiscount = totalAfterDiscount[0];

        
        for (Order order : orders) {
            System.out.println(order);
        }
        System.out.println("Total : " + total +" €");
        System.out.println("Discount : " + discount*100 +" %");
        System.out.println("Amount Discount : " + String.format("%.2f",amountDiscount) +"€");
        System.out.println("Total after Discount : " + String.format("%.2f",finalTotal) +"€");
    }
}
