package AlphaBrains;

import java.net.*;
import java.io.*;


public class UrlProg {

    public static void main(String[] args) throws Exception {

        URL wiki = new URL("https://www.youtube.com/watch?v=I_qP7H3STMg");

        System.out.println("Basic information!");

        System.out.println(wiki.getProtocol());
        System.out.println(wiki.getPort());
        System.out.println(wiki.getHost());

        URLConnection urlConnection = wiki.openConnection();

        int contentLen = urlConnection.getContentLength();
        int ch;

        if(contentLen != 0){
            System.out.println("Content : ");
            InputStream urlInput = urlConnection.getInputStream();

            while (((ch = urlInput.read()) != -1)){
                System.out.print(ch);
            }

            urlInput.close();
        }

    }
}
