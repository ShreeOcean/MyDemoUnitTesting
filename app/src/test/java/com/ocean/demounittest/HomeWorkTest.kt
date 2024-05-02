package com.ocean.demounittest

import org.junit.Assert.*
import org.junit.Test

class HomeWorkTest{

    @Test
    fun `test fibonacci`(){
        assertEquals(0, HomeWork.fib(0))
        assertEquals(1, HomeWork.fib(1))
        assertEquals(1, HomeWork.fib(2))
        assertEquals(2, HomeWork.fib(3))
        assertEquals(3, HomeWork.fib(4))
        assertEquals(5, HomeWork.fib(5))
        assertEquals(8, HomeWork.fib(6))
    }

    @Test
    fun testCheckBraces() {
        assertTrue(HomeWork.checkBraces("((a * b))"))
        assertTrue(HomeWork.checkBraces("(a * b)"))
        assertFalse(HomeWork.checkBraces("((a * b)"))
        assertFalse(HomeWork.checkBraces("(a * b))"))
        assertTrue(HomeWork.checkBraces("()"))
        assertTrue(HomeWork.checkBraces(""))
        // Add more test cases as needed
    }
}