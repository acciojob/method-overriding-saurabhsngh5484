package com.driver;

public class Main {
    static class A
    {
        public String meth()
        {
            return "Invoking method from class A";

        }
    }
    static class B extends A{

        public String meth()
        {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        B object = new B();
        object.meth();
        B obj = new B();
        obj.meth();

    }
}