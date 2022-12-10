import java.util.*;
import java.io.*;

public abstract class Attribute implements Serializable{
    
    int display;
    int ubuffer;
    int dbuffer;
    Integer[] data = {0, 1, 2};

    public Attribute() {
        display = 1;
        ubuffer = 0;
        dbuffer = 0;
    }

    public Attribute(int _display) {
        this.display = _display;
    }

    public int getDisplay() {
        return this.display;
    }

    public void setDisplay(int _display) {
        this.display = _display;
    }

    public int getuBuffer() {
        return this.ubuffer;
    }

    public void setuBuffer(int _ubuffer) {
        this.ubuffer = _ubuffer;
    }

    public int getdBuffer() {
        return this.dbuffer;
    }

    public void setdBuffer(int _dbuffer) {
        this.dbuffer = _dbuffer;
    }

    public Integer[] getData(){
        return this.data;
    }

    public void setData(Integer[] _data) {
        this.data = _data;
    }

    public void incUp() {
        int itemp = Arrays.asList(data).indexOf(display);
        itemp += 1;
        if (itemp <= 2) {
            display = itemp;
            ubuffer = 0;
        }
        else {
            itemp -= 1;
            ubuffer = 1;
        }
    }

    public void incDown() {
        int dtemp = Arrays.asList(data).indexOf(display);
        dtemp -= 1;
        if (dtemp >= 0) {
            display = dtemp;
            dbuffer = 0;
        }
        else {
            dtemp += 1;
            dbuffer = 1;
        }
    }
}
