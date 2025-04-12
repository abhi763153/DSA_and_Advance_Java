package LeetCode;
import java.util.*;

public class stringEncodingDecoding {

    static  Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();

        str.add("z{}~|");
        str.add("yode");
        str.add("love");
        str.add("you");

        List<String> decoded = new ArrayList<>();

//        String result = String.join(":", str);
        String endcoded = encode(str);
        decoded = decode(endcoded);
        System.out.println(decoded);
    }

    public static List<String> decode(String str) {

        String[] strList = str.split(":");
        List<String> decoded = new ArrayList<>();

        for (String s : strList){
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            StringBuilder newsb = new StringBuilder("");

            for(int i=0; i<sb.length(); i++){
                char c = sb.charAt(i);
                int ascii = (int)c;

                if(ascii+10 <= 127){
                    ascii -= 10;
                }

                char ch = (char)ascii;
                newsb.append(ch);

            }
            decoded.add(newsb.toString());
        }


        return decoded;
    }

    public static String encode(List<String> strs) {

        List<String> list = new ArrayList<>();

        for(String word: strs){

            StringBuilder sb = new StringBuilder(word);
            StringBuilder newsb = new StringBuilder("");


            for(int i=0; i<sb.length(); i++){
                char c = sb.charAt(i);
                int ascii = (int)c+10;
                if (ascii>127){
                    ascii -= 10;
                }
                char ch = (char)(ascii);
                newsb.append(ch);
            }

            newsb.reverse();
            list.add(newsb.toString());
        }

        String singleStr = String.join(":", list);

        return singleStr;
    }
}
