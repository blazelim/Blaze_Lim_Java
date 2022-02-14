package com.company;

public class ConverterApplication {


    public static void main(String[] args) {
        ConverterIf ifConverter = new ConverterIf();
        ConverterSwitch switchConverter = new ConverterSwitch();

        System.out.println("====================== ConverterIf ============================");
        for (int i = 0; i < 13; i++) {
            System.out.println(ifConverter.convertMonth(i));
        }

        for (int i = 0; i<8 ; i++) {
            System.out.println(ifConverter.convertDay(i));
        }
        System.out.println("====================== ConverterSwitch ============================");
        for (int i = 0; i < 13; i++) {
            System.out.println(switchConverter.convertMonth(i));
        }

        for (int i = 0; i<8 ; i++) {
            System.out.println(switchConverter.convertDay(i));
        }
    }
}
