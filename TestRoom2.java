import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mimi
 */
public class TestRoom2 {


    public static void main(String args[]) {
        Room mr = new BasicRoom();
        System.out.println(mr.getDescription() + " $" + mr.cost());

        Room mr2 = new BasicRoom();
        mr2 = new FoodBar(mr2);
        mr2 = new Spa(mr2);
        mr2 = new AutoRefillingFoodBar(mr2);
        System.out.println(mr2.getDescription() + " $" + mr2.cost());

        Room mr3 = new BasicRoom();
        mr3 = new Spa(mr3);
        mr3 = new SprayResistantShower(mr3);
        mr3 = new FoodBar(mr3);
        System.out.println(mr3.getDescription() + " $" + mr3.cost());

        RoachMotel rm = RoachMotel.getInstance();
        rm.createRooms();
        System.out.println(rm);
        RoachColony rc1 = new  RoachColony("first colony",100,200);
        ArrayList amenities = new ArrayList();
        amenities.add("foodbar");
        amenities.add("spa");
        amenities.add("refillbar");
        amenities.add("shower");
        Room r1 = rm.checkIn(rc1,"Suite",amenities);
        System.out.println(rc1);
        System.out.println(rm);
        r1.setDoNotDisturb();
        RoachColony rc2 = new RoachColony("Second colony",1000,0.2);
        ArrayList amenities2 = new ArrayList();
        amenities2.add("foodbar");
        Room r2 = rm.checkIn(rc2,"Deluxe",amenities2);
        System.out.println(rc2);
        System.out.println(rm);
        rc2.party();
        System.out.println(rc2);
        Double cost = rm.checkOut(r2,3,"MasterRoach");
        System.out.println("cost:" + cost);
        System.out.println(rm);
        RoachColony rc3 = new RoachColony("third colony",300,0.3);
        Room r3 = rm.checkIn(rc3,"Regular",amenities2);
        RoachColony rc4 = new RoachColony("fourth colony",400,0.4);
        Room r4 = rm.checkIn(rc4,"Regular",amenities2);
        r3.setDoNotDisturb();
        System.out.println("Time to clean the rooms today "+rm);
        rm.cleanRooms();
        RoachColony rc5 = new RoachColony("fifth colony",500,0.5);
        Room r5 = rm.checkIn(rc5,"Deluxe",amenities2);
        RoachColony rc6 = new RoachColony("sixth colony",600,0.6);
        Room r6 = rm.checkIn(rc6,"Deluxe",amenities2);
        RoachColony rc7 = new RoachColony("Seventh colony",700,0.7);
        Room r7 = rm.checkIn(rc7,"Suite",amenities2);
        RoachColony rc8 = new RoachColony("eigth colony",800,0.8);
        Room r8 = rm.checkIn(rc8,"Suite",amenities2);
        RoachColony rc9 = new RoachColony("ninth colony",900,0.9);
        System.out.println("Time to clean the rooms today"+ rm);
        r1.setDoNotDisturb();
        rm.cleanRooms();
        cost = rm.checkOut(r3,3, "RoachPay");
        System.out.println("cost:" + cost);
        Room r9 = rm.checkIn(rc9,"Regular",amenities2);
        rm.cleanRooms();
    }
}
