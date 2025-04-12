package Comparator;

import java.util.Comparator;

public class CustomeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2){

        if(s1.getRoll() - s2.getRoll() < 0){
            return -1;
        }
        else if(s2.getRoll() - s1.getRoll() > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
