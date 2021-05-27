package com.example.simplejunit

import junit.framework.TestCase

class SimpleCalcTest : TestCase() {

    private var calculator: SimpleCalc? = null

    public override fun setUp() {
        calculator = SimpleCalc()
    }

    public override fun tearDown() {
        calculator = null
    }

    fun testAddition() {
        assertEquals(3.0, calculator?.addition(1,2))
    }

    fun testSubtraction() {
        assertEquals(-1.0, calculator?.subtraction(1,2))
    }

    fun testDivision() {
        assertEquals(3.0, calculator?.division(6,2))
        assertNotSame(3.0, calculator?.division(3,0))
        assertEquals(Double.NaN, calculator?.division(6,0))
    }

    fun testMultiplication() {
        assertEquals(12.0, calculator?.multiplication(6,2))
    }

    fun testModulus() {
        assertEquals(0.0, calculator?.modulus(6,2))
        assertEquals(Double.NaN, calculator?.modulus(4,0))
    }
}