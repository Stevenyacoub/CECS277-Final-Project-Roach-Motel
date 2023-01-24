public abstract class RoomDecorator extends Room {
    protected Room decoratedRoom;

    public RoomDecorator(Room decoratedRoom){
        this.decoratedRoom = decoratedRoom;
    }
}
