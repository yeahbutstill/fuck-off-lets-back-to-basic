package desktop.ifnu.bima.feel.of.java.oop.classpenting.io;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class ImageTest {
    public static void main(String[] args){
        try{
            URL url = new URL("https://pnganime.com/web/images/G/Gojo-PNG-Photos.png");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            try (OutputStream fileOutputStream = new FileOutputStream("gojo.png")) {
                int byteRead;
                do{
                    byteRead = inputStream.read();
                    fileOutputStream.write(byteRead);
                } while (byteRead != -1);

                fileOutputStream.flush();
            }

            // menampilkan image
            Icon icon = new ImageIcon(ImageIO.read(new File("gojo.png")));
            JOptionPane.showMessageDialog(
                    null,
                    "ini gambar",
                    "menampilkan gambar",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
