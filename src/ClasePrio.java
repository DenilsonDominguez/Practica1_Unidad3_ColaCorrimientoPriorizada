

//Este es la clase donde se aplica el proceso de prioridad
public class ClasePrio {
    protected int i,f;
   
    protected PrioridadTDA[] ARR;
    
    public ClasePrio(int tamano){
        ARR = new PrioridadTDA[tamano];
        i = -1;
        f = -1;
    }
    
    public boolean insertar(PrioridadTDA dato){
        if(estaColaLlena()){ 
            return false;
        }   
        f= f+1; 
        ARR[f] = dato; 
        if(i == -1){
            i = 0;
        }
        if (f>=1){
        CompararNivel(dato);
        }
        return true;
    }
    
    public boolean eliminar(){
        if(estaColaVacia()){
            return false;
        }     
        if(i == f){
            i = -1;
            f = -1;
            return true;
        }
        i++;
        
        return true;
    }

    protected void CompararNivel(PrioridadTDA dato) {
         PrioridadTDA t;
        for(int j=f-1; j>=0; j--){
            if(dato.getPrioridad() > ARR[j].getPrioridad()){
                t = ARR[j];
                ARR[j] = dato;
                ARR[j+1] = t;
            }
        }
    }
    
    public PrioridadTDA getValor(int pos){
        return ARR[pos];
    }
    
    protected boolean estaColaLlena(){
        return f == ARR.length-1;
    }
    
    protected boolean estaColaVacia(){
        return i == -1 && f == -1;
    }
    
    protected boolean UnSoloDato(){
        return i == f;
    }
    
    public int getIni(){
        return i;
    }
    
    public int getFin(){
        return f;
    }

    /*boolean insertar(PrioridadTDA dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
