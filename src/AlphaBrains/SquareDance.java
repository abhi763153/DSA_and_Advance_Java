package AlphaBrains;

import java.io.*;
import java.util.PriorityQueue;

public class SquareDance {

    public static void main(String[] args) {

        PriorityQueue<String> men = new PriorityQueue<>();
        PriorityQueue<String> women = new PriorityQueue<>();

        String line = null;
        String sex = "";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/dance.txt"));
            while ((line = reader.readLine()) != null){
                sex = line.substring(0,1);
                if(sex.equals("M")){
                    men.add(line.substring(2));
                }else {
                    women.add(line.substring(2));
                }
                // System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException("Problem with file!");
                }
            }
        }

        while (!men.isEmpty() && !women.isEmpty()){
            System.out.println("The dance partner will be : "+ men.poll() + " and "+ women.poll());
        }

    }
}