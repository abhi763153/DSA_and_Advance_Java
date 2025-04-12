package String;

public class StringPerformanceTesting {

    public static void main(String[] args) {


        String str = "";
        Long startTime = System.currentTimeMillis();

        for(int i=0; i<100000; i++){
            str += "java";
        }

        System.out.println("String time : "+ (System.currentTimeMillis() - startTime));


        StringBuilder sb = new StringBuilder();

        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            sb.append("java");
        }

        System.out.println("StringBuilder time : "+ (System.currentTimeMillis() - startTime));

        StringBuffer sbf = new StringBuffer();

        startTime = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            sbf.append("java");
        }

        System.out.println("StringBuffer time : "+ (System.currentTimeMillis() - startTime));


    }
}
