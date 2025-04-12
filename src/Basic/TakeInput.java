package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TakeInput {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        String name = scanner.next();
//
//        System.out.println(name);


        // Input from file
        FileInputStream stream=null;
//        try(FileInputStream stream = new FileInputStream("G:\\Java\\Kunal Kushwaha DSA\\DSA_Java\\src\\Basic\\input.txt"))
        try {
            stream = new FileInputStream("G:\\Java\\Kunal Kushwaha DSA\\DSA_Java\\src\\Basic\\input.txt");
            int data;
            while((data = stream.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("File not found!");
        }finally {
            if(stream != null){
                try {
                    stream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
