/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garadicorsa;

/**
 *
 * @author nirug
 */
import java.util.ArrayList;

public class GaraDiCorsa 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int players = 6; 

        ArrayList <Corridore> lista = new ArrayList <>();
        
        for(int i = 0; i < players; i++){
            lista.add(new Corridore("PLAYER "+ (i+1)));
        }
        
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).start();
        }
        
        try 
        {
             for(int i = 0; i < lista.size(); i++)
             {
            	 lista.get(i).join();
             }
        } catch (Exception e) {}


        Corridore.stampaClassifica();
        
    }
    
}
