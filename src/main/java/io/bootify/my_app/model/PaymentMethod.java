package io.bootify.my_app.model;


public enum PaymentMethod {

    CREDIT_CARD("credit card"),
    UPI("upi"),
    NET_BANKING("net banking");

    private PaymentMethod(String name)
    {
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }

}
