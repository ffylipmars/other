
package tablerofichas;

/**
 *
 * @author ffylipm
 */
public class Tablero 
{ 
    private String[][] spaces;
    private String blank;
    
    public Tablero(int filas, int col, String s)
    {
        spaces = new String[filas][col];
        
        for(int i = 0; i < filas; ++i)
            for(int j = 0; j < col; ++j)
                spaces[i][j] = s;
        blank = s;
    }
    
    public boolean ponerFicha(int fil, int col, boolean or, Ficha f)
    {
        if(!verificarEspacio(fil, col, or, f.getSize()))
            return false;
        
        int size = f.getSize();
        String simbol = f.getSimbol();
        
        if(or)
           for(int i = col; i < col + size; ++i)
            spaces[fil][i] = simbol;
        
        else
            for(int i = fil; i < fil + size; ++i)
            spaces[i][col] = simbol;
        
        return true;    
    }
    
    public boolean verificarEspacio(int fil, int col, boolean or, int size)
    {
        if(or)
            return verificarHorizontal(fil, col, size);
        
        else
            return verificarVertical(fil, col, size);         
    }
    
    public boolean verificarHorizontal(int fil, int col, int size)
    {
        int cont = 0;
            for(int j = col; j < spaces[fil].length; ++j)
                {              
                    if(!spaces[fil][j].equals(blank))
                        return false;
                    else
                        cont++;
                    
                    if(cont == size)
                        return true;
                }
                
        return cont == size;      
    }
    
    public boolean verificarVertical(int fil, int col, int size)
    {
        int cont = 0;
        for(int j = fil; j < spaces.length; ++j)
        {              
            if(!spaces[j][col].equals(blank))
                    return false;
            else
                cont++;        
                    
            if(cont == size)
                return true;       
        }        
                
        return cont == size;  
    }
    
    public String toString()
    {
        String s = "";
        
        for(String[] arr: spaces)
        {
            for(String e: arr)
                s += e;
            s += "\n";
        }
        
        return s;
    }
   
    public int getFil()
    {
        return spaces.length;
    }
    
    public int getCol()
    {
        return spaces[0].length;
    }   
}
