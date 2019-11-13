package com.bmuschko.messenger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessengerTest {
    @Test
    @DisplayName("Can retrieve message")
    public void testGetMessage() {
        Messenger messenger = new Messenger();
        assertEquals("HELLO WORLD!", messenger.getMessage());
    }
}