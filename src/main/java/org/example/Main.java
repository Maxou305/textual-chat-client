package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ChatClient client = new ChatClient();
        client.startConnection("172.22.114.81", 6666);
        client.sendMessage("hello server");
    }
}