/*
(Catching Exceptions Using Class Exception) Write a program that demonstrates how various
exceptions are caught with
catch (Exception exception)
This time, define classes ExceptionA (which inherits from class Exception) and ExceptionB (which
inherits from class ExceptionA). In your program, create try blocks that throw exceptions of types
ExceptionA, ExceptionB, NullPointerException and IOException. All exceptions should be
caught with catch blocks specifying type Exception.
 */
package com.java.howtoprogram;

import java.io.IOException;

public class Main1117 {

    public static void main(String[] args) {
        try {
            getExceptionA();
        } catch (Exception e) {
            System.err.println(e);
        }

        try {
            getExceptionB();
        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            getNullPointerException();
        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            getIOException();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void getExceptionA() throws ExceptionA {
        throw new ExceptionA();
    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB();
    }

    public static void getNullPointerException() throws NullPointerException {
        throw new NullPointerException();
    }

    public static void getIOException() throws IOException {
        throw new IOException();
    }
}
