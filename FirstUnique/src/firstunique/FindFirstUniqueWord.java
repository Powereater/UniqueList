
package firstunique;


import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;




public class FindFirstUniqueWord {
    public String first (List<String> theList) {
        List<String> output = new ArrayList<String>(theList);
        Set<String> singles = new HashSet<String>();
        Set<String> dupes = new HashSet<String>();
        
        
        for (String i: theList) {
            if (!dupes.contains(i)) {
                if (singles.contains(i)){
                    singles.remove(i);
                    dupes.add(i);
                }
                else {
                    singles.add(i);
                }
                        }
        }
        
        
        //////////////
        //// use the following to check try and check if doubs and singles
        
        
        //System.out.println("singles are " + singles);
        //System.out.println("duplicates are " + dupes);
        
        
        
        /////////////
        
        
        
        for (String i: theList){
            if (singles.contains(i)) {
                return i;
            }
        }
        
        
        
        
     return "none of them";   
    }
    
}
