package control;
public class Potenciometro{
    //Atributos de Potenciometro
    public float[] potencia;
    public int aguja;
    //Constructores
    public Potenciometro(int pos){
        int x;
        potencia=new float [pos];
        
        for(x=0;x<potencia.length;x++){
            potencia[x]=(float)x;
        }
    }
    
    public Potenciometro(float[] valores){
        int x; 
        potencia=new float[valores.length];
     
        for(x=1;x<valores.length;x++){
            potencia[x]=valores[x];
        }
    }
    
    public Potenciometro(int pos, float min, float incremento){
        int x;
        float valores;
        
        potencia=new float [pos];
        valores=min;
        
        for(x=1;x<potencia.length;x++){
            potencia[x]=valores;
            valores+=incremento;
        }
    }
    
    public Potenciometro(int pos, float min){
        //this(pos, min, 1); --> Alternativa
        int x;
        float valores;
        
        potencia=new float [pos];
        valores=min;
        
        for(x=1;x<potencia.length;x++){
            potencia[x]=valores;
            valores++;
        }
    }
    
    //Funciones
    //Funciones de Consulta
    public int posicion(){ //posicion que esta marcando
        return aguja;
    }
    
    public int posiciones(){ //numero de posiciones que hay
        return potencia.length;
    }
    
    public float potencia(){    
        return potencia[aguja];
    }
    public boolean apagado(){
        if(aguja==0)
            return true;
        else
            return false;
    }
    
    public void mostrar(){
    
    }
    //Funciones de Modificaci�n
    public void subir(){
        //subir(1) -->Alternativa
        if(aguja<potencia.length-1)
            aguja++;
    }
    
    public void subir(int x){
        int pos;
        pos=aguja+x;
        
        if(x<=0)
            throw new NegativeArraySizeException("No se puede");
        if(pos>=potencia.length)
            aguja=potencia.length-1;
        else
            aguja+=x;
    }
    
    public void bajar(){
        //bajar(1) -->Alternativa
        if(aguja>0)
        aguja--;
    }
    
    public void bajar(int x){
        int pos;
        pos=aguja-x;
        
        if(x<=0)
            throw new NegativeArraySizeException("No se puede");
        if(pos<=0)
            aguja=0;
        else
            aguja-=x;
    }
    
    public void apagar(){
        aguja=0;
    }
    
}

