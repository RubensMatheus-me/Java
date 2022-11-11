package entities;

public class EmptyRooms {
    private int room;
    private String name;
    private String gmail;
    
    public EmptyRooms(String name, String gmail, int room) {
        this.name = name;
        this.gmail = gmail;
        this.room = room;
    }
    public String getName() {
        return name;
    }
    public String getGmail() {
        return gmail;
    }
    public int getRoom() {
        return room;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setGmail (String gmail) {
        this.gmail = gmail;
    }
    public void setAge (int room) {
        this.room = room;
    }
    
}
