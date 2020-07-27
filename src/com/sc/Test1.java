package com.sc;

public class Test1 {

    public void changeValue1(int age){
        age=30;
    }

    public void changeValue2(Person person){
        person.setPersonName("xxx");
    }

    public void changeValue3(String str){
        str="xxx";
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int age=10;
        test1.changeValue1(age);
        System.out.println("age======"+age);

        Person person = new Person();
        person.setPersonName("abc");
        test1.changeValue2(person);
        System.out.println("personName====="+person.getPersonName());

        String str="abc";
        test1.changeValue3(str);
        System.out.println("String======="+str);
    }


}
