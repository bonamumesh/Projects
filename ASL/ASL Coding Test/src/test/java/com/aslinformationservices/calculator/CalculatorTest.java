package com.aslinformationservices.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

   

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

        @Test
        void testSubtract () {
            Calculator calculator = new Calculator();
            assertEquals(2, calculator.subtract(5, 3));
        }


    @Test
    void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(3,5));
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
    }

            @Test
            void testDivideByZero () {
                Calculator calculator = new Calculator();
                assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
            }

        @Test
        void testCalculateMean () {
            CustomFeature customFeature = new CustomFeature();
            assertEquals(4, customFeature.calculateMean(2, 4, 6));
        }

        @Test
        void testCalculateMeanWithEmptyArray () {
            CustomFeature customFeature = new CustomFeature();
            assertThrows(IllegalArgumentException.class, () -> customFeature.calculateMean());

        }

        @Test
        void testCalculateMeanWithSingleNumber () {
            CustomFeature customFeature = new CustomFeature();
            assertEquals(5, customFeature.calculateMean(5));

        }

        @Test
        void testCalculateMeanWithNegativeNumbers () {
            CustomFeature customFeature = new CustomFeature();
            assertEquals(-3, customFeature.calculateMean(-2, -4, -6));
        }


    @Test
    void testSolveLinearEquation() {
        EquationSolver equationSolver = new EquationSolver() {
            assertEquals(2,equationSolver.solveLinearEquation(2,3,7));
        }


        @Test
        void testSolveLinearEquationWithZerocoefficientA () {
            assertThrows(IllegalArgumentException.class, () -> equationSolver.solveLinearEquation(0, 3, 7));
        }
        @Test
        void testSolveLinearEquationWithNegativeCoefficients () {
            EquationSolver equationSolver = new EquationSolver();
            assertEquals(-5, equationSolver.solveLinearEquation(-2, 3, 7));
        }

        @Test
        void testSolveLinearEquationWithZeroC () {
            EquationSolver equationSolver = new EquationSolver();
            assertEquals(1.5, equationSolver.solveLinearEquation(2, 3, 0));
        }
    }



