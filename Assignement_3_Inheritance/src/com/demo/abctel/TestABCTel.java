package com.demo.abctel;

public class TestABCTel {

    public static void main(String[] args) {

        // Vendor
        String[] products = {"SIM Cards", "Routers"};
        Vendor v = new Vendor(1, "ABC Supplier", "abc@mail.com", "9876543210", products);
        v.display();

        // Individual Customer
        IndividualCustomer ic = new IndividualCustomer(
                "Rahul", "rahul@mail.com", "A", 10, "Gold", "9999999999"
        );
        ic.display();

        // Company Customer
        String[] nums = {"1001", "1002", "1003"};
        CompanyCustomer cc = new CompanyCustomer(
                "TCS", "tcs@mail.com", "A+", 20, "Corporate",
                "Manager1", 500000, 3, nums
        );
        cc.display();
    }
}


//Design a class hierarchy to maintain information for ABCTel telecom company
//, company wants to maintain information of customers and vendors.
//For vendors they want to store vendorid, name, email, phone number,list of products they supply 
//For customers they want to store custid, name, email, credit class(based on credit history), discounts, plan assigned to customer
//Customer may be Individual or a company For individual customer, system should store phone number For a customer of type Company, 
//system should store info about relationship manager, credit line, extensions, list of numbers