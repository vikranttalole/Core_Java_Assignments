package com.product;

public class TestProduct {

    public static void main(String[] args) {

        Product p1 = new PerishableProduct(1, "Milk", "01-01-2025", 50, "05-01-2025");
        Product p2 = new NonPerishableProduct(2, "Chair", "01-01-2025", 2000, "Furniture");

        p1.display();
        p2.display();
    }
}

//Product assignment Class Product Id, name, type (perishable/nonperishable) Mfgdate,
//For perishable Exp-date Price 
//Nonperishable ---- category (furniture, statitionary, utensils) 
//CalculateTax() If product is perishable then tax = 5% of price Otherwise Tax= 15% of price+100 