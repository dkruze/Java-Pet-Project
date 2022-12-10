import java.util.*;
import java.io.*;

public abstract class Friend implements Serializable{
    
    transient Scanner takein = new Scanner(System.in);
    Hunger h = new Hunger();
    Fatigue f = new Fatigue();
    Attention a = new Attention();
    String name;
    boolean sleepCheck = false;

    public Friend() {
        name = "Scruffles";
    }

    public Friend(String _name) {
        this.name = _name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public boolean getSleepcheck() {
        return this.sleepCheck;
    }

    public void setSleepcheck(boolean _sleepCheck) {
        this.sleepCheck = _sleepCheck;
    }

    public void feed() {
        h.incUp();
        h.printHunger();
        if (h.ubuffer == 0 && h.dbuffer == 0) {
            System.out.print(name + " is now " + h.hungerStatus);
            System.out.print("\n");
        }
        else {
        }
        f.incDown();
        f.printFatigue();
        if (f.ubuffer == 0 && f.dbuffer == 0) {
            System.out.print(name + " is now " + f.fatigueStatus);
            System.out.print("\n");
        }
        else {
        }
    }

    public void pet() {
        a.incUp();
        a.printAttention();
        if (a.ubuffer == 0 && a.dbuffer == 0) {
            System.out.print(name + " is now " + a.attentionStatus);
            System.out.print("\n");
        }
        else {
        }
    }

    public void walk() {
        f.incUp();
        f.printFatigue();
        if (f.ubuffer == 0 && f.dbuffer == 0) {
            System.out.print(name + " is now " + f.fatigueStatus);
            System.out.print("\n");
        }
        else {
        }
        h.incDown();
        h.printHunger();
        if (h.ubuffer == 0 && h.dbuffer == 0) {
            System.out.print(name + " is now " + h.hungerStatus);
            System.out.print("\n");
        }
        else {
        }
        sleepCheck = false;
    }

    public void rename() {
        System.out.print("Your furry friend is currently called " + name + ". What shall their new name be?");
        System.out.print("\n");
        boolean keepGoing = true;
        while (keepGoing) {
            String newName = takein.nextLine();
            if (newName.matches(".*[0-9].*")) {
                System.out.print("Please do not include any Numbers.");
                System.out.print("\n");
            }
            else {
                name = newName;
                System.out.print("Your friend's new name is " + name);
                System.out.print("\n");
                keepGoing = false;
            }
        }
    }

    public void sleep() {
        if (sleepCheck == false) {
            f.display = 0;
            h.display = 0;
            a.display = 0;
            System.out.print("Sleep tight, " + name + "...");
            System.out.print("\n");
            System.out.print("Rise and shine, " + name + "!");
            System.out.print("\n");
            sleepCheck = true;
        }
        else {
            System.out.print("Sleep already? No way!");
            System.out.print("\n");
        }
    }

    public void check() {
        System.out.print(name + " is " + h.hungerStatus + ", feed accordingly");
        System.out.print("\n");
        System.out.print(name + " is " + a.attentionStatus + ", pet accordingly");
        System.out.print("\n");
        System.out.print(name + " is " + f.fatigueStatus + ", exercise accordingly");
        System.out.print("\n");
    }

}
