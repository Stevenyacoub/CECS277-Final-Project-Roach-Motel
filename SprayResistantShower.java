public class SprayResistantShower extends RoomDecorator{

    public SprayResistantShower(Room decoratedRoom) {
        super(decoratedRoom);
        decoratedRoom.augmentRate(25);
    }
}
