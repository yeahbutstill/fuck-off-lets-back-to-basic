package desktop.ifnu.bima.oop.io;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class PingPongClient {
    public static void main(String[] args) {
        try {
            //1. Membuat client socket sekaligus menghubungi server
            Socket clientSocket = new Socket("localhost", 4444);
            System.out.println("client konek to server localhost:4444");

            //2. Membuat reader dan writer untuk membaca dan menulis data ke server
            BufferedWriter out = new BufferedWriter(
                    new OutputStreamWriter(clientSocket.getOutputStream()));
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            do {
                //3. Dalam sebuah loop, kirim data ke server
                out.write("Ping\n");
                System.out.println("Send ping to server");
                out.flush();

                //4. Dalam loop yang sama berusaha terima data dari server
                String inputLine = in.readLine();
                System.out.println("Recieved " + inputLine + " from server");

                //5. Dalam loop tersebut lakukan 1 detik pause agar output bisa bagus
                Thread.sleep(1000);
            } while (true); //lakukan terus menerus
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
