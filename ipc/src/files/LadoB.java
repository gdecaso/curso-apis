package files;

import java.io.*;
import java.util.Date;

public class LadoB {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("t.tmp");
                ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeInt(100);
            oos.writeObject(new Date());
        }
    }
}
