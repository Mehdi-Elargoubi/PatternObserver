import java.util.Observable;

public class ConcreteSubject extends Observable {
    private String name;
    private float price;

    public ConcreteSubject(String name, float price) {
        this.name = name;
        this.price = price;
        System.out.println("ConcreteSubject created: " + name + " at " + price);
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers(name);
    }

    public void setPrice(float price) {
        if (this.price != price) {
            this.price = price;
            notifyObservers(Float.valueOf(price));  // Utilisation de Float.valueOf() au lieu du constructeur
        }
    }

}
