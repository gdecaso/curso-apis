package sockets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;

public class LadoB {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost",6666);
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())){
            oos.writeInt(100);
            oos.writeObject(new Date());
        }
    }
}
