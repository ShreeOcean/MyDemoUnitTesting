package com.ocean.demounittest

object HomeWork {

    /**
     * Returns the n-th fibonacci number
     * They are defined like this
     * f(0) = 0,
     * f(1) = 1,
     * f(n) = f(n-2) + f(n-1)
     * */
    fun fib(n : Int): Long{
        if (n == 0 || n == 1){
            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c :Long //= 1L
        /*(1..n-2).forEach{i ->
            c = a + b
            a = b
            b = c
        }*/
        repeat(n - 1){
            c = a + b
            a = b
            b = c
        }
        return b //c
    }

    /**
     * Check if the braces are set correctly
     * e.g. "(a*b))" should return false
     * */
    fun checkBraces(s : String): Boolean{
        return s.count{ it == '('} == s.count { it == ')' }
    }
}