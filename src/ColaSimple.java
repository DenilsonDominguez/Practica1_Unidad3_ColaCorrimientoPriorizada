
public class ColaSimple {
    protected char[] vector;
    protected int INI;
    protected int FIN;


    public ColaSimple(int tamano){
        vector = new char[tamano];
        INI= -1;
        FIN= -1;
        
    }
    
    public boolean insertar(char dato){
        if (estaColaLlena()){
            return false;
        }
        FIN ++;
        vector[FIN] = dato;
        
        if(INI == -1){
            INI=0;
        }
        
        return true;
    }
    
    protected boolean estaColaLlena(){
        return FIN == vector.length-1;
    }
    
    public boolean eliminar(){
        if (estaColaVacia()){
            return false;
        
        }
        if (unSoloDato()){
            INI = -1;
            FIN= -1;
            return true;
        }
        INI++;
        return true;
    }
    
    protected boolean estaColaVacia(){
    return INI == -1 && FIN == -1;
    }
    
    protected boolean unSoloDato(){
        return INI==FIN;
    }
    
    public char getValor(int pos){
        return vector[pos];
    }
    
    public int getIni(){
        return INI;
    }
    
    public int getFin(){
        return FIN;
    }
}