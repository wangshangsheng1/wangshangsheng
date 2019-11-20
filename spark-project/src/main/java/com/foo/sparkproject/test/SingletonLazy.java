package com.foo.sparkproject.test;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Leader on 2019/11/15.
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {
        System.out.println("实例化了一个新的单例");
    }



    public static SingletonLazy getInstance() {
        if (instance != null) return instance;//为了增加效率，当拥有了实例后，我们直接返回实例。因为拥有了实例后，状态就跟饿汉一致了，显然不会发生线程问题。
        synchronized (SingletonLazy.class) {//因为是静态方法，所以用类做同步锁
            if (instance == null) instance = new SingletonLazy();
            return instance;
        }
    }




}
