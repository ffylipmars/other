
package tablerofichas;

/**
 *
 * @author ffylipm
 */
public class Main {
    
    public static void main(String args[])
    {                   
        Tablero t = new Tablero(15, 15, "-");
        
        Portavion portavion = new Portavion();
        Barco barco = new Barco();
        Fragata fragata = new Fragata();
                  
        ponerNFichas(t, portavion, 1);
        ponerNFichas(t, barco, 3);
        ponerNFichas(t, fragata, 4);
        
        System.out.println(t);
    }
    
    public static void ponerNFichas(Tablero t, Ficha f, int n)
    {
        int numFil = t.getFil();
        int numCol = t.getCol();
        
        while(n > 0)
        {
            if(t.ponerFicha(randomN(numFil), randomN(numCol), randomB(), f))
                n--;
        }
    }
    
    public static boolean randomB()
    {
        return Math.random() < 0.5;
    }
    
    public static int randomN(int n)
    {
        return (int)(Math.random()*n);
    }
}
