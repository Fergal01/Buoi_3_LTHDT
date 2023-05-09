/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi3;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

	    Order order = new Order(1, LocalDate.of(2023, 5, 9));

	    order.addLineItem(new Product("sp4", "Nước tương", 8000), 10);
	    order.addLineItem(new Product("sp1", "Gạo", 18000), 5);
	    order.addLineItem(new Product("sp4", "Đường", 10000), 1);
	    order.addLineItem(new Product("sp1", "Gạo", 18000), 1);

	    System.out.println(order.toString());
	}
}
