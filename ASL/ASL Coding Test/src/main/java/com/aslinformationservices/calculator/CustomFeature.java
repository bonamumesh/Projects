package com.aslinformationservices.calculator;

public class CustomFeature {

    public double calculateMean(double... numbers) {
    	// TODO: Implement custom feature logic
        if(numbers.length ==0){
            throw new IllegalAgumentException("To calculate mean at least one number is required");
        }
        double sum =0;
        for(double number : numbers){
            sum+=number;
        }
        return sum/numbers.length;
    }
}