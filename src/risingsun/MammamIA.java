/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package risingsun;

import java.util.Vector;

/**
 *
 * @author QB
 */
public class MammamIA {
    
    public int K1 = 1;
    public int K2 = 1;
    public int K3 = 1;
    public int K4 = 1;
    public int K5 = 1;
    
    public Player p;
    public MammamIA(Player p) {
        this.p =p;
    }
    public Action[] play(Map m){
        Vector<Action> v = new Vector<>();
        //int nbNodes = m.v.size();
        
        for (int i = 0; i < m.v.size(); i++) {  //chaque noeud de la carte
            int nNeighbors = m.v.get(i).neighbors.length;
            int[] tabValues = new int[nNeighbors];
            int[] tabId = new int[nNeighbors];
            for (int j = 0; j < nNeighbors; j++) { //chaque voisin du noeud
                Node n = m.v.get(m.v.get(i).neighbors[j].id);
                tabId[j] = m.v.get(i).neighbors[j].id;
                tabValues[j] = 0;
                tabValues[j] += K1 * n.production;
                /*value += K2 * n.production;
                value += K3 * n.production;
                value += K4 * n.production;
                value += K5 * n.production;*/
            }
            
        }
        
        return (Action[])v.toArray(new Action[v.size()]);
    }
}
