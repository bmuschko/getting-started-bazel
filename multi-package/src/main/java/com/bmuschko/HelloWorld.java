package com.bmuschko;

import com.bmuschko.messenger.Messenger;

public class HelloWorld {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        System.out.println(messenger.getMessage());
    }
}