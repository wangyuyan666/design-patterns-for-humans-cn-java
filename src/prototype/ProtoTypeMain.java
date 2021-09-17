package prototype;

public class ProtoTypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep original = new Sheep("Jolly");
        System.out.println(original.getName()); // Jolly
        System.out.println(original.getCategory()); // Mountain Sheep

        Sheep cloned = (Sheep) original.clone();
        cloned.setName("Dolly");
        System.out.println(cloned.getName());  // Dolly
        System.out.println(cloned.getCategory()); // Mountain sheep
    }

}
