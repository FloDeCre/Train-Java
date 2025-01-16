public class Order {
    private String name;
    private Double price;
    private int quantity;

public Order(String name,Double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}

public String getName(){
    return name;
}
public Double getPrice(){
    return price;
}
public int getQuantity(){
    return quantity;
}

public Double getTotalOrder(){
    return quantity*price;
}

@Override
public String toString(){
    return "Product name : "+name+", price :"+price+"€, quantity :"+quantity+", total :"+quantity*price+"€";
}
}