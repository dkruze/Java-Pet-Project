import java.util.*;
import java.io.*;

public class Attention extends Attribute implements Serializable {
    
    String attentionStatus;

    public Attention() {
        super();
        attentionStatus = "pleased";
    }

    public Attention(String _attentionStatus) {
        this.attentionStatus = _attentionStatus;
    }

    public String getAttention() {
        return this.attentionStatus;
    }

    public void setAttention(String _attentionStatus) {
        this.attentionStatus = _attentionStatus;
    }

    public void printAttention() {
        if (ubuffer == 1) {
            System.out.print("Leave \'em' alone!");
            System.out.print("\n");
        }
        else if (dbuffer == 1) {
            System.out.print("Pet this guy already!");
            System.out.print("\n");
        }
        else if (display == 0) {
            attentionStatus = "desperate for affection";
        }
        else if (display == 1) {
            attentionStatus = "pleased";
        }
        else {
            attentionStatus = "sick of being touched";
        }
    }
}
