import java.text.SimpleDateFormat;
import java.util.ArrayList; 
import java.util.Date;
import java.util.List;


// The Subject interface 
interface Subject {
    void registerObserver(Observer o); 
    void removeObserver(Observer o); 
    void notifyObservers();
}

// The Observer interface 
interface Observer {
    void update(String location, String store, Date openingdate, Date closingdate, double openingtime, double closingtime); 
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
    private double openingtime;
    private double closingtime;

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

    public void setMeasurements(String location, String store, Date openingdate, Date closingdate, double openingtime, double closingtime) { 
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
    private String location;
    private String store;   
    private Date openingdate;
    private Date closingdate;
    private double openingtime;
    private double closingtime;
    private Subject PopUpStore;

    
    
    public CurrentConditionsDisplay(Subject PopUpStore) { 
        this.PopUpStore = PopUpStore; 
        PopUpStore.registerObserver(this);
    }
    
    public void update(String location, String store, Date openingdate, Date closingdate, double openingtime, double closingtime) { 
        this.location = location;
        this.store = store;
        this.openingdate = openingdate;
        this.closingdate = closingdate;
        this.openingtime = openingtime;
        this.closingtime = closingtime;
        display();
    }

    public void display() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formattedOpeningDate = sdf.format(openingdate);
        String formattedClosingDate = sdf.format(closingdate);

        System.out.println("We look forward to seeing you at our new Pop-Up store in " + location + ", kindly hosted by  " + store + 
        ", on the following dates: " + formattedOpeningDate + " - " + formattedClosingDate + ", at the following times:" + openingtime + " - " + closingtime);
    } 
}



// The main method
public class Newsletter {
    public static void main(String[] args) {
        PopUpStore PopUpStore = new PopUpStore();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date openingDate = sdf.parse("2023/01/12");
        Date closingDate = sdf.parse("2023/01/19");
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(PopUpStore);

        PopUpStore.setMeasurements("Turin", "Hannibal", openingDate, closingDate, 9.00, 19.00); 
    } 
}
