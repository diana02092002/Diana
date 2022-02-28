package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

                double temperature = 1;
                System.out.println("t = " +
                        new CelsiusConverter().getConvertedValue(temperature));
                System.out.println("t = " +
                        new KelvinConverter().getConvertedValue(temperature));
                System.out.println("t = " +
                        new FahrenheitConverter().getConvertedValue(temperature));
            }
        }
