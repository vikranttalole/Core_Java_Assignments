package com.demo;

public class MyClass {

    @CustomAnnotation
    public void method1() {
        System.out.println("Method 1 Executed");
    }

    public void method2() {
        System.out.println("Method 2 Executed");
    }

    @CustomAnnotation
    public void method3() {
        System.out.println("Method 3 Executed");
    }

    public void method4() {
        System.out.println("Method 4 Executed");
    }
}
