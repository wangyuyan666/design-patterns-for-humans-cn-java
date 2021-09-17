package prototype;

public class Sheep implements Cloneable {

    private String name;
    private String category;

    public Sheep(String name) {
        this.name = name;
        this.category = "Mountain Sheep";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
