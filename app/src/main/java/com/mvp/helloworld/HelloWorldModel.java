package com.mvp.helloworld;

/**
 * Represents the M part in MVP architecture
 * Simple model that returns random messages
 */
public class HelloWorldModel {
    private String[] messages = {"Hello World", "Hi", "Hello"};

    public String generateRandomHelloWorldText() {
        return messages[(int) (Math.random() * 3)];
    }
}
