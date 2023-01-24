public class CleaningService implements Visitable {

    @Override
    public void cleanRoom(BasicRoom basic){
        System.out.println("Linens changed on each bed.");
        System.out.println("Towels on the floor were replaced.");
    }

    @Override
    public void cleanRoom(Suite suite){
        System.out.println("Linens changed on each bed.");
        System.out.println("All towels replaced.");
        System.out.println("Complimentary hamburgers placed on each pillow");
    }

    @Override
    public void cleanRoom(DeluxeRoom deluxe){
        System.out.println("Linens changed on each bed.");
        System.out.println("All towels replaced.");
    }
    
}
