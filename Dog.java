import java.util.*;
import java.io.*;

public class Dog extends Friend implements Serializable {

    public Dog() {
        super();
    }

    public static void main(String[] args) throws Exception {
        Dog d = new Dog();
        try {
    		FileInputStream fi = new FileInputStream("Pet_Manifest.txt");
    		ObjectInputStream obIn = new ObjectInputStream(fi);
    		d = (Dog)obIn.readObject();
    	}
        catch (Exception e){
    		System.out.println(e.getMessage());
    	} 
        d.menu();
        try {
			FileOutputStream fo = new FileOutputStream("Pet_Manifest.txt");
			ObjectOutputStream obOut = new ObjectOutputStream(fo);
			obOut.writeObject(d);
		} 
        catch (Exception e){
			System.out.println(e.getMessage());
		} 
        
    }

    public void menu() {
        System.out.print("Welcome to your Perfect Pet: Dog Edition! What shall we do with our friend today?");
        System.out.print("\n");
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.print("1) Check on " + name + "\n2) Feed " + name + "\n3) Pet " + name + "\n4) Take " + name + " for a walk \n5) Let " + name + " sleep \n6) Play tug-o-war with " + name + "\n7) Send " + name + " on a playdate \n8) Rename " + name + "\n9) Quit \n");
            String userInput = takein.nextLine();
            if (userInput.equals("1")) {
                check();
            }
            else if (userInput.equals("2")) {
                feed();
            }
            else if (userInput.equals("3")) {
                pet();
            }
            else if (userInput.equals("4")) {
                walk();
            }
            else if (userInput.equals("5")) {
                sleep();
            }
            else if (userInput.equals("6")) {
                tugowar();
            }
            else if (userInput.equals("7")) {
                playdate();
            }
            else if (userInput.equals("8")) {
                rename();
            }
            else if (userInput.equals("9")) {
                keepGoing = false;
            }
        }
    }

    public void tugowar() {
        f.display = 2;
        a.incUp();
        a.printAttention();
        if (a.ubuffer == 0 && a.dbuffer == 0) {
            System.out.print(name + " is now " + a.attentionStatus);
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
        System.out.print(name + " loves tug-o-war, but really wore themselves out!");
        System.out.print("\n");
        sleepCheck = false;
    }

    public void playdate() {
        a.display = 0;
        f.incUp();
        f.printFatigue();
        if (f.ubuffer == 0 && f.dbuffer == 0) {
            System.out.print(name + " is now " + f.fatigueStatus);
            System.out.print("\n");
        }
        else {
        }
        System.out.print("Welcome back " + name + "! Did you miss me?");
        System.out.print("\n");
        sleepCheck = false;
    }
}
