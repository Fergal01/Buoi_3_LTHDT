/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private LocalDate orderDate;
     private OrderDetail[] lineItems;
    private int count;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
         lineItems = new OrderDetail[10];
        count = 0;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }


   public void addLineItem(Product p, int q) {
        lineItems[count] = new OrderDetail(p, q);
        count++;
    }

public double calcTotalCharge() {
        double totalCharge = 0;
        for (int i = 0; i < count; i++) {
            totalCharge += lineItems[i].calcTotalPrice();
        }
        return totalCharge;
    }
 public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Mã HD: %d%n", this.orderID));
        result.append(String.format("Ngày lập hoá đơn: %s%n", this.orderDate));
        result.append(String.format("%-5s | %-20s | %-20s | %15s | %10s | %15s%n", "STT", "Mã SP", "Mô tả", "Đơn giá", "Số lượng", "Thành tiền"));

        // Duyệt qua từng sản phẩm trong đơn hàng
        for (int i = 0; i < count; i++) {
            OrderDetail item = lineItems[i];
            Product product = item.getProduct();
            int quantity = item.getQuantity();
            double price = product.getPrice();
            double total = item.calcTotalPrice();
            result.append(String.format("%-5d | %-20s | %-20s | %,15.0f | %,10d | %,15.0f%n", i+1,product.getDescription(), product.getProductID(), price, quantity, total));
        }
       double totalCharge = calcTotalCharge();
        result.append(String.format("%-53s %,15.0f VND", "Tổng tiền thanh toán:", totalCharge));
        return result.toString();
    }
    
    
    }

