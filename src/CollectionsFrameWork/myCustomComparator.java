package CollectionsFrameWork;

import java.util.Comparator;

public class myCustomComparator implements Comparator<studentMarks> {

    public int compare(studentMarks o1, studentMarks o2){
        return o1.getChy() - o2.getChy();
    }

}
