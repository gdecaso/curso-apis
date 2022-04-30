package sockets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LadoA {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ServerSocket socket = new ServerSocket(6666)) {
            Socket s = socket.accept();
            try (ObjectInputStream ois = new ObjectInputStream(s.getInputStream())) {
                System.out.println("El entero es: " + ois.readInt());
                System.out.println("La fecha es: " + ois.readObject());
            }
        }
    }
}
