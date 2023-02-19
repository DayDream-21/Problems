package com.slavamashkov.problems.yandex.training_1_0.lesson1;

public class Conditioner {
    public void setTemp(int troom, int tcond, String type) {
        if (type.equals("freeze")) {
            if (tcond < troom) {
                System.out.println(tcond);
            } else if (tcond > troom) {
                System.out.println(troom);
            } else {
                System.out.println(troom);
            }
        } else if (type.equals("heat")) {
            if (tcond < troom) {
                System.out.println(troom);
            } else if (tcond > troom) {
                System.out.println(tcond);
            } else {
                System.out.println(troom);
            }
        } else if (type.equals("auto")) {
            System.out.println(tcond);
        } else if (type.equals("fan")) {
            System.out.println(troom);
        } else {
            System.out.println("Unsupportable operation");
        }
    }
}
