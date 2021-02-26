package com.company;

public class Light {
    public static void main(String [] args){

        long lightspeed = 30000; // 빛의 속도
        long distance =0;    // 거리
        distance = lightspeed * 365 * 24 * 60 * 60;
        System.out.println("빛이 1년동안 가는 거리 는 "+ distance + "km 입니다");
    }
}