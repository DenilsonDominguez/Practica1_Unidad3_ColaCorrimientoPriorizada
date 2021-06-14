//Denilson Dominguez Herrera 
public class ColaCorrimiento extends ClasePrio{
     
     protected char[] vector;
     protected int INI;
     protected int FIN;
    public ColaCorrimiento(int t){
        super(t);
      
    }
    
     @Override
    public boolean insertar(PrioridadTDA dato){
          boolean respuesta = super.insertar(dato);
        if(respuesta == true){
            return respuesta;
        }
        
        if (INI>0){
            corrimiento();
            return insertar(dato);
            
        }
        
        
        return false;
    }//insertar
    
    public void corrimiento(){
        int recibe=0;
        int envia;
        
        for(envia=INI; envia<=FIN; envia++, recibe++){
            vector[recibe]= vector[envia];
        }
        
        INI=0;
        FIN= recibe-1;
    }
    
    
}
