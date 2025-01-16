public class Discount {
    public static double select_discount(double total, double discount) {
        double firstDiscount = 0.1;
        double secondDiscount = 0.05;

        if (discount != 0) {
            return discount / 100.0;
        } else if (total > 1000) {
            return firstDiscount;
        } else if (total > 500 && total <= 1000) {
            return secondDiscount;
        } else {
            return 0;
        }
    }

    public static double[] apply_discount(double total, double discountSelected) {
        double amountDiscount = total * discountSelected;
        double totalAfterDiscount = total - amountDiscount;

        return new double[]{amountDiscount, totalAfterDiscount};
    }
}
