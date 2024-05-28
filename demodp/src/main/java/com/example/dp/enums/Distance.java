package com.example.dp.enums;

public enum Distance {
    MOTO(20),
    CAR(30),
    PLANE(40);

    public final Integer distance;

    private Distance(Integer distance){
        this.distance = distance;
    }

    public Integer getDistance(){
        return this.distance;
    }
}
