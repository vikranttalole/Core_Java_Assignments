package com.demo;

import java.lang.reflect.Method;

public class AnnotationDemo {

    public static void main(String[] args) throws Exception {

        MyClass obj = new MyClass();

        Method methods[] = MyClass.class.getDeclaredMethods();

        System.out.println("Annotated Methods:");

        for (Method m : methods) {

            if (m.isAnnotationPresent(CustomAnnotation.class)) {

                System.out.println(m.getName());
                m.invoke(obj);
            }
        }

        System.out.println("\nNon Annotated Methods:");

        for (Method m : methods) {

            if (!m.isAnnotationPresent(CustomAnnotation.class)) {

                System.out.println(m.getName());
            }
        }
    }
}
