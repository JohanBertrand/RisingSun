/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package risingsun;

import org.json.JSONArray;
import org.json.JSONObject;
import static risingsun.GameServer.*;


/**
 *
 * @author QB
 */
public class RisingSun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        // LOVE STRAS
        
        reset(); 
        Player p1 = join("monia"); 
        Player p2 = join("monia2"); 
        
//        String[] str = post("http://localhost:8080/IA/Join","IAName=monia"); 
//        String[] str = get("http://localhost:8080/Reset"); 
//        System.out.println(str[0]);
//        System.out.println(str[1]);
    }
    
}
