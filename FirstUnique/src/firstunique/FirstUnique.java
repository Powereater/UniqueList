/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstunique;

/**
 *
 * @author SteveWang
 */
import java.util.List;
import java.util.ArrayList;

public class FirstUnique {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> big =new ArrayList<String>();
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
        uniquemethods firstSpecial = new uniquemethods();
        System.out.println(firstSpecial.first(big));
        
//        ArrayList<String> small =new ArrayList<String>();
//        small.add("blue");
//        
//        small.add("green");
//        small.add("yellow");
//        
//        System.out.println(small);
//        
//        big.removeAll(small);
//        
//        System.out.println(big);
//        
        
        // TODO code application logic here
    }
    
}
