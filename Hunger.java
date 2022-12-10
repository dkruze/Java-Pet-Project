import java.util.*;
import java.io.*;

public class Hunger extends Attribute implements Serializable {
    
    String hungerStatus;

    public Hunger() {
        super();
        hungerStatus = "content";
    }

    public Hunger(String _hungerStatus) {
        this.hungerStatus = _hungerStatus;
    }

    public String getHunger() {
        return this.hungerStatus;
    }

    public void setHunger(String _hungerStatus) {
        this.hungerStatus = _hungerStatus;
    }

    public void printHunger() {
        if (ubuffer == 1){
            System.out.print("Stop feedin\' \'em!");
            System.out.print("\n");
        }
        else if (dbuffer == 1) {
            System.out.print("Feed this guy already!");
            System.out.print("\n");
        }
        else if (display == 0) {
            hungerStatus = "ravenously hungry";
        }
        else if (display == 1) {
            hungerStatus = "content";
        }
        else if (display == 2) {
            hungerStatus = "eatin\' good";
        }
    }
}
