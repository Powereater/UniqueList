/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunique;

import java.util.List;
import java.util.ArrayList;
//import java.util.HashMap;

/**
 *
 * @author SteveWang
 */
public class uniquemethods {
    
    public String first (List<String> theList) {
        List<String> output = new ArrayList<String>(theList);
        List<String> sorter = new ArrayList<String>();
        //HashMap<String , Integer> sorter =  new HashMap<String , Integer>();
        List<String> dupes = new ArrayList<String>();
        
        for (String i: theList) {
            if (sorter.contains(i)) {
                dupes.add(i);
            }
            else {
                sorter.add(i);
            }
        }
        
        output.removeAll(dupes);
        
        
     return output.get(0);   
    }
    
}
