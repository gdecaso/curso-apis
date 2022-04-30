package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LadoA {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("t.tmp");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            System.out.println("El entero es: " + ois.readInt());
            System.out.println("La fecha es: "+ ois.readObject());
        }
    }
}
