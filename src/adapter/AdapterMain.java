package adapter;

public class AdapterMain {
    public static void main(String[] args) {
        WildDog dog = new WildDog();
        WildDogAdapter dogAdapter = new WildDogAdapter(dog);

        Hunter hunter = new Hunter();
        hunter.hunt(dogAdapter);
    }
}
