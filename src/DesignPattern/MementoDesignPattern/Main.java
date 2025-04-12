package DesignPattern.MementoDesignPattern;

public class Main {
    public static void main(String[] args) {

        var editor = new Editor();
        var history = new History();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("C");
        editor.resoreState(history.pop());
        editor.resoreState(history.pop());
        System.out.println(editor.getContent());


    }
}
