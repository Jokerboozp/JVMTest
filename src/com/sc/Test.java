package com.sc;

public class Test {

    public static void main(String[] args) {
        Object object = new Object();

        Test test = new Test();
        System.out.println(test.getClass().getClassLoader());
        System.out.println(test.getClass().getClassLoader().getParent());
        System.out.println(test.getClass().getClassLoader().getParent().getParent());
    }
}
