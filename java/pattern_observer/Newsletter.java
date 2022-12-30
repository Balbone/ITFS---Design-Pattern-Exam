import java.util.ArrayList; 
import java.util.List;
// cfr. https://stackoverflow.com/questions/6516320/datetime-datatype-in-java
import java.util.Date;


// The Subject interface 
interface Subject {
    void registerObserver(Observer o); 
    void removeObserver(Observer o); 
    void notifyObservers();
}

// The Observer interface 
interface Observer {
    void update(String location, String store, Date openingdate, Date closingdate, float openingtime, float closingtime); 
}

// The DisplayElement interface just has one method, display, that we will call when the display element 
// needs to be displayed.
interface DisplayElement {
    void display(); 
}

// The PopUpStore class is the Subject 
class PopUpStore implements Subject {

    private List<Observer> observers; 
    private String location;
    private String store;
    private Date openingdate;
    private Date closingdate;
    private float openingtime;
    private float closingtime;

    public PopUpStore() {
    observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) { 
        observers.add(o);
    }

    public void removeObserver(Observer o) { 
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i); 
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(location, store, openingdate, closingdate, openingtime, closingtime); 
        }
    }

    public void measurementsChanged() { 
        notifyObservers();
    }

    public void setMeasurements(String location, String store, Date openingdate, Date closingdate, float openingtime, float closingtime) { 
        this.location = location;
        this.store = store;
        this.openingdate = openingdate;
        this.closingdate = closingdate;
        this.openingtime = openingtime;
        this.closingtime = closingtime;
        measurementsChanged(); 
    }
}

// The Observer class
class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature; 
    private float humidity; 
    private Subject PopUpStore;
    
    public CurrentConditionsDisplay(Subject PopUpStore) { 
        this.PopUpStore = PopUpStore; 
        PopUpStore.registerObserver(this);
    }
    
    public void update(String location, String store, Date openingdate, Date closingdate, float openingtime, float closingtime) { 
        this.location = location;
        this.store = store;
        this.openingdate = openingdate;
        this.closingdate = closingdate;
        this.openingtime = openingtime;
        this.closingtime = closingtime;
        display();
    }
    public void display() {
    System.out.println("We look forward to seeing you at our new Pop-Up store in " + location + ", kindly hosted by  " + store + 
    ", on the following dates: " + openingdate + " - " + closingdate + ", at the following times:" + openingtime + " - " + closingtime);
    } 
}



// The main method
public class Newsletter {
    public static void main(String[] args) {
        PopUpStore PopUpStore = new PopUpStore();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(PopUpStore);

        PopUpStore.setMeasurements("Turin", "Hannibal", "2023/01/12", "2023/01/19", 9.00, 19.00); 
    } 
}
