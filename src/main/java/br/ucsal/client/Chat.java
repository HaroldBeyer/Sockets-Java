package br.ucsal.client;

public class Chat {
    private Window window;
    private SocketClient socketClient;

    public Chat(Window window, SocketClient socketClient) {
        this.window = window;
        this.socketClient = socketClient;
    }
}
