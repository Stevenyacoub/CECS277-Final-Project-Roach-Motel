import java.util.ArrayList;
import java.util.List;

public class RoachMotel {
    RoomFactory roomMaker = new RoomFactory();
    private static RoachMotel motel = new RoachMotel();
    ArrayList<Room> roomList = new ArrayList<Room>(); 

    private RoachMotel(){}

    public static RoachMotel getRoachMotel(){
        return motel;
    }

    public void createRooms(){
        for(int i = 0; i < 5; i++){
            roomList.add(roomMaker.getRoom("basic"));
        }
    }

    public static RoachMotel getInstance(){
        return new RoachMotel();
    }
}
