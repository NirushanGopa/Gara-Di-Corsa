package garadicorsa;

import java.util.ArrayList;

/**
 *
 * @author nirug
 */
public class Corridore extends Thread
{
    public static ArrayList<String> classifica = new ArrayList<>();
    
    public Corridore(String name) 
    {
        super(name);
    }
    
    @Override
    public void run() 
    {
        for(int i = 0; i < 100; i++)
        {
            System.out.println("metro numero: " + i + " del corridore: " + super.getName());
        }
        
        aggiungiElementoClassifica(super.getName());
    }
    
    public static synchronized void aggiungiElementoClassifica(String name)
    {
       System.out.println(":::::::::::::::::::::::::::metro numero: "  + " del corridore: " + name);
       classifica.add(name + " ARRIVATO");
    }
    
    public static void stampaClassifica(){
    	for(int i = 0; i < classifica.size(); i++) 
            System.out.println("n." + (i+1) + " " + classifica.get(i));
    }
    
}
