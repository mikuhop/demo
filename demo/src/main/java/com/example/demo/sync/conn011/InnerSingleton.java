package com.example.demo.sync.conn011;

public class InnerSingleton {

    private static class Singleton {
        private static Singleton singleton = new Singleton();
    }

    public Singleton getInstance() {
        return Singleton.singleton;
    }

}
