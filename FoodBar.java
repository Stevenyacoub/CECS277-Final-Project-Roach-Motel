public class FoodBar extends RoomDecorator{

	public FoodBar(Room decoratedRoom) {
                super(decoratedRoom);
                decoratedRoom.augmentRate(10);
	}

}
