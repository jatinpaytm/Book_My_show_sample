package io.bootify.my_app.model;


public enum CinemaSeatType {

    PLATINUM("platinum"),
    GOLD("gold"),
    SILVER("silver");

    private CinemaSeatType(String name)
    {
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }

}
