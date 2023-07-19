package desktop.ifnu.bima.oop.io;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class ImageTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://f4.bcbits.com/img/a3494731263_10.jpg");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            OutputStream outputStream = new FileOutputStream("image.png");
            int byteRead;
            do {
                byteRead = inputStream.read();
                outputStream.write(byteRead);
            } while (byteRead != -1);
            outputStream.flush();
            outputStream.close();
            // menampilkan image
            Icon icon = new ImageIcon(ImageIO.read(new File("image.png")));
            JOptionPane.showMessageDialog(null, "ini gambar", "menampilkan gambar",
                    JOptionPane.INFORMATION_MESSAGE, icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
