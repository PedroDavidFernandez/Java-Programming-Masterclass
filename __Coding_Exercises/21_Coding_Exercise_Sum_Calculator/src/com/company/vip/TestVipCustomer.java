package com.company.vip;

public class TestVipCustomer {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println("Customer1 name is: " +  customer1.getName());
        System.out.println("Customer1 limit is: " +  customer1.getLimit());
        System.out.println("Customer1 email is: " +  customer1.getEmail());

        VipCustomer customer2 = new VipCustomer("pepe", 10L);
        System.out.println("Customer2 name is: " +  customer2.getName());
        System.out.println("Customer2 limit is: " +  customer2.getLimit());
        System.out.println("Customer2 email is: " +  customer2.getEmail());

        VipCustomer customer3 = new VipCustomer("pedro", 1000000000000L, "pedro@email.com");
        System.out.println("Customer3 name is: " +  customer3.getName());
        System.out.println("Customer3 limit is: " +  customer3.getLimit());
        System.out.println("Customer3 email is: " +  customer3.getEmail());
    }
}
