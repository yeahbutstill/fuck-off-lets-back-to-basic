package desktop.ifnu.bima.feel.of.java.oop.classpenting.io;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPongServer {
  public static void main(String[] args) {
    try {
      // 1. buka server socket
      ServerSocket server = new ServerSocket(4444);
      System.out.println("Server ready. Listening in port 4444");

      // 2. berusaha menerima client
      Socket clientSocket = server.accept();
      System.out.println("Connection from client is excepted");

      // 3. membuat reader dan writer untuk menerima dan mengirim data ke client
      BufferedWriter out =
          new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      String inputLine = null;

      // 4. dalam sebuah loop akan membaca data yang dikirim client
      while ((inputLine = in.readLine()) != null) {
        System.out.println("Recieved " + inputLine + " from client");

        // 5. Kalau ada data yang dikirim client segera membalas dengan mengirim Pong ke client
        out.write("Pong\n");
        System.out.println("Send Pong to client");
        out.flush();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
/** Kode untuk server ini harus dijalankan terlebih dahulu sebelum client dijalankan. */
