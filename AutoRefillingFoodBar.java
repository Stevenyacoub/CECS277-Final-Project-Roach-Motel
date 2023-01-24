public class AutoRefillingFoodBar extends RoomDecorator {

    public AutoRefillingFoodBar(Room decoratedRoom) {
        super(decoratedRoom);
        decoratedRoom.augmentRate(5);
    }
    
}
