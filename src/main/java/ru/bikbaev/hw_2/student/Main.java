package ru.bikbaev.hw_2.student;


import ru.bikbaev.hw_2.student.client.ClientGUI;
import ru.bikbaev.hw_2.student.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}
