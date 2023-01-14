package DesignPatterns._5_Proxy;

import ro.sda.advanced._10_encapsulation.Person;

public class ExpensiveObjectProxy implements ExpensiveObject {

    private static ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if (expensiveObject==null){
            expensiveObject=new ExpensiveObjetImpl();

        }expensiveObject.process();
        }

    }

