package de.thws.lektion18.galgenmaenchen;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        final int port = 6000;
        try(ServerSocket socket = new ServerSocket(port)){
            System.out.println("Server running on port" + port);
            Socket connection = socket.accept();
            InputStream is = connection.getInputStream();

        }
    }
}
