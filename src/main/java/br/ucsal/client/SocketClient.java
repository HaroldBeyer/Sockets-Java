package br.ucsal.client;

import java.io.*;
import java.net.Socket;

public class SocketClient {
    private Socket socket;
    private OutputStream ou ;
    private Writer ouw;
    private BufferedWriter bfw;

    public SocketClient(Socket socket, String name) throws IOException {
        this.socket = socket;
        this.ou = socket.getOutputStream();
        this.ouw =  new OutputStreamWriter(this.ou);
        this.bfw = new BufferedWriter(ouw);
        this.bfw.write(name);
        bfw.flush();
    }

    public void sendMsg(String msg) throws IOException {
    }

    public void listener() throws IOException {
    }
}
