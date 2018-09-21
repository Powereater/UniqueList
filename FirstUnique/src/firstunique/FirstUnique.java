


package firstunique;




import java.util.List;
import java.util.ArrayList;

public class FirstUnique {
    

    
    public static void main(String[] args) {
        ArrayList<String> big = new ArrayList<String>();
        big.add("blue");
        big.add("blue");
        big.add("blue");
        big.add("red");
        big.add("green");
        big.add("yellow");
        big.add("red");
        big.add("blue");
        big.add("blue");
        big.add("blue");
        
        
        System.out.println(big);
        FindFirstUniqueWord firstSpecial = new FindFirstUniqueWord();
        System.out.println("the first non-duplicate is " + firstSpecial.first(big));
        
        
    }
    
}
