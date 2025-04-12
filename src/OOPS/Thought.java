package OOPS;

import java.time.LocalDateTime;

public class Thought {
    private String content;
    private String type;
    private LocalDateTime dateTime;

    public Thought(String content, String type, LocalDateTime dateTime) {
        this.content = content;
        this.type = type;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Thought{" +
                "content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
