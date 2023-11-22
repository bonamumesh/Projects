package com.aslinformationservices.calculator;

public class EquationSolver {

    public double solveLinearEquation(double a, double b, double c) {
    	// TODO: Implement custom feature logic
        if(a ==0){
            throw new IllegalArgumentException("Coefficient a cannot be zero");
        }
        return (c-b)/a;
    }
}