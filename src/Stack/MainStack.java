package Stack;

public class MainStack {

    public static void main(String[] args) {

        CustomStack<Integer> st = new CustomStack<>();

        try {
            st.push(4);
            st.push(6);
            st.push(1);
        } catch (Exception e){
            e.printStackTrace();
        }

        st.print();
        System.out.println();
        try {
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(st.getSize());
        st.print();
    }
}
