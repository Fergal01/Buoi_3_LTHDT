/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

public class OrderDetail {
    private int quantity;
    private final Product product;
    
    public OrderDetail(){
        this.product = null;
        
    }
    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public double calcTotalPrice() {
        return this.quantity * this.product.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "quantity=" + quantity +
                ", product=" + product +
                '}';
    }

   
}
