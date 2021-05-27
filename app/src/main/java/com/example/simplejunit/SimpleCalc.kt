package com.example.simplejunit

class SimpleCalc {

    fun addition(a: Int, b: Int) = a.toDouble() + b.toDouble()
    fun subtraction(a: Int, b: Int) = a.toDouble() - b.toDouble()
    fun division(a: Int, b: Int):Double{
        return if(b==0){
            Double.NaN
        } else{
            a.toDouble() / b.toDouble()
        }
    }
    fun multiplication(a: Int, b: Int) = a.toDouble() * b.toDouble()
    fun modulus(a: Int, b: Int): Double {
        return if(b==0){
            Double.NaN
        } else{
            a.toDouble()%b.toDouble()
        }
    }
}