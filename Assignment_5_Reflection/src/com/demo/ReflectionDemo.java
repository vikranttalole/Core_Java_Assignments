package com.demo;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo {

    public static void displayClassInfo(Class<?> cls) {

        System.out.println("\nClass Name : " + cls.getName());

        Method methods[] = cls.getDeclaredMethods();

        for (Method m : methods) {

            System.out.println("\nMethod Name : " + m.getName());

            Parameter params[] = m.getParameters();

            System.out.println("Parameter Count : " + params.length);

            for (Parameter p : params) {
                System.out.println("Parameter Name : " + p.getName());
                System.out.println("Parameter Type : " + p.getType().getSimpleName());
            }
        }
    }

    public static void main(String[] args) throws Exception {

        displayClassInfo(Rectangle.class);
        displayClassInfo(Student.class);
        displayClassInfo(Friend.class);
        displayClassInfo(MyClass.class);

        MyClass obj = new MyClass();

        Method methods[] = MyClass.class.getDeclaredMethods();

        for (Method m : methods) {

            if (m.getParameterCount() >= 3) {

                System.out.println("\nInvoking : " + m.getName());

                if (m.getName().equals("method5")) {
                    m.invoke(obj, 10, 20, 30, 40);
                }

                if (m.getName().equals("method6")) {
                    m.invoke(obj, "A", "B", "C", "D");
                }
            }
        }
    }
}
