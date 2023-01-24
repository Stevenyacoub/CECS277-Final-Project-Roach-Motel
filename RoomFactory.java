public class RoomFactory {
    public Room getRoom(String roomType){
        if(roomType.equalsIgnoreCase("DELUXE")){
            return new DeluxeRoom();
        }else if(roomType.equalsIgnoreCase("SUITE")){
            return new Suite();
        }else if(roomType.equalsIgnoreCase("BASIC")){
            return new BasicRoom();
        }
        return null;
    }    
}
