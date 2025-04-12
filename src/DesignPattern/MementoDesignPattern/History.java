package DesignPattern.MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class History {

    List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        return states.remove(states.size()-1);
    }
}
