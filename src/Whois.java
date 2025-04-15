import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {

    public static void main(String[] args) {

        try(Socket socket = new Socket("whois.verisign-grs.com", 43)) {

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            String domain = "ibm.com\r\n";

            outputStream.write(domain.getBytes());
            outputStream.flush();

            int ch;

            while ((ch = inputStream.read()) != -1){
                System.out.print((char) ch);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
