package com.company.vip;

public class VipCustomer {
    private String name;
    private Long limit;
    private String email;
    
    public VipCustomer() {
        this("foo", 0L, "no email");
    }

    public VipCustomer(String name, Long limit) {
        this(name, limit, "empty email");
    }

    public VipCustomer(String name, Long limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }


    public Long getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
