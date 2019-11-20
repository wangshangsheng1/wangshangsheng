package com.foo.sparkproject.test;

import org.junit.Test;

/**
 * Created by Leader on 2019/11/15.
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();
    private SingletonHungry() {
        System.out.println("实例化了一个新的单例-----");
    }
    public static SingletonHungry getInstance() {
        return instance;
    }

}


