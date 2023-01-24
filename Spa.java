public class Spa extends RoomDecorator {

    public Spa(Room decoratedRoom) {
        super(decoratedRoom);
        decoratedRoom.augmentRate(20);
    }
}
