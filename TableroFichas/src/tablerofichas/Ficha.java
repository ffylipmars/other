
package tablerofichas;

/**
 *
 * @author ffylipm
 */
public class Ficha 
{
    private String simbol;
    private int spaces;
    
    public Ficha(String simbol, int spaces)
    {
        this.simbol = simbol;
        this.spaces = spaces;
    }
    
    public int getSize() { return spaces; }
    
    public String getSimbol() 
    {
        return simbol;
    }
       
    public String toString()
    {
        return simbol;
    }
}
