

//Denilson Dominguez Herrera
//Aquii utilizamos la implementacion de metodos Get and Set
public class PrioridadTDA {
     protected int p;
    protected char dato;
    
    

    public PrioridadTDA(int p, char dato) {
        this.dato = dato;
        this.p = p;
    }

    public PrioridadTDA() {
       
    }

    //Metodos Get
    public int getPrioridad() {
        return p;
    }
    
    public char getDato() {
        return dato;
    }
//Metodos Set
    public void setValor(char dato) {
        this.dato = dato;
    }

     public void setPrioridad(int prioridad) {
        this.p = prioridad;
    }
     
    public void setObjeto(PrioridadTDA obj) {
        this.p = obj.p;
        this.dato = obj.dato;
    }
    
    @Override
    public String toString(){
        return "["+dato+"]"+"["+p+"]"+"\n";
    }
}
