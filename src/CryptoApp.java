import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CryptoApp {
    public static void main  (String [] Args) throws  Exception{
        Crypto crypto = new BasicCrypto();
        String data = "Hello world";
        String enc = new String(crypto.incrypt(data.getBytes()));
        String dec = new String(crypto.decrypt(enc.getBytes()));

        System.out.println("original: " + data);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);

        byte [] data1 = Files.readAllBytes(Paths.get(System.getProperty("user.dir")+ "/src/data1.txt"));
        byte [] data2 = crypto.incrypt(data1);
        byte [] data3 = crypto.decrypt(data2);
        Files.write( Paths.get(System.getProperty("user.dir")+ "/src/data2.txt"), data2);
        Files.write( Paths.get(System.getProperty("user.dir")+ "/src/data3.txt"), data3);



    }
}
