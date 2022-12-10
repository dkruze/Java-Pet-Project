import java.util.*;
import java.io.*;

public class Fatigue extends Attribute implements Serializable {
    
    String fatigueStatus;

    public Fatigue() {
        super();
        fatigueStatus = "at ease";
    }

    public Fatigue(String _fatigueStatus) {
        this.fatigueStatus = _fatigueStatus;
    }

    public String getFatigue() {
        return this.fatigueStatus;
    }

    public void setFatigue(String _fatigueStatus) {
        this.fatigueStatus = _fatigueStatus;
    }

    public void printFatigue() {
        if (ubuffer == 1) {
            System.out.print("Let \'em' rest!");
            System.out.print("\n");
        }
        else if (dbuffer == 1) {
            System.out.print("Are you gonna play with this guy or not?");
            System.out.print("\n");
        }
        else if (display == 0) {
            fatigueStatus = "ready to rock";
        }
        else if (display == 1) {
            fatigueStatus = "at ease";
        }
        else {
            fatigueStatus = "very tired";
        }
    }
}
