package CollectionsFrameWork;

public class studentMarks{

    private int math;
    private int phy;
    private int chy;

    public studentMarks(int math, int phy, int chy) {
        this.math = math;
        this.phy = phy;
        this.chy = chy;
    }

    public int getMath() {
        return math;
    }

    public int getPhy() {
        return phy;
    }

    public int getChy() {
        return chy;
    }

    @Override
    public String toString() {
        return "studentMarks{" +
                "math=" + math +
                ", phy=" + phy +
                ", chy=" + chy +
                '}';
    }

//    @Override
//    public int compareTo(studentMarks o) {
//
////        if(this.math < o.math){
////            return -1;
////        }
////        else if(this.math > o.math){
////            return 1;
////        }
////        else{
////            return 0;
////        }
//
//        return (o.chy - this.chy);
//    }
}
