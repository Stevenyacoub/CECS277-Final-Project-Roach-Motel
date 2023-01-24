public class Room {
    private int cost = 0;

    public Room(){

    }

    public void augmentRate(int change) {
        cost = cost + change;
    }

    public String getDescription(){
        return "This is a room";
    }
}
