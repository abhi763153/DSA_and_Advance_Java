package Basic;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        List<String> oneList = Arrays.asList("hello","bad","world");

        List<String> twoList = Arrays.asList("c","hello","world","wed");

        System.out.print(getSameElement(oneList, twoList));

    }

    public static List<String> getSameElement(List<String> oneList, List<String> twoList) {

        //TODO add your own code
        List<String> res = new ArrayList<>();

        Set<String> set = new HashSet<>(twoList);

        for(String str: oneList){
            if(set.contains(str)){
                res.add(str);
            }
        }

        return res;



    }
}




