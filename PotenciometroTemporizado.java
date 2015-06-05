package control;
public class PotenciometroTemporizado extends Potenciometro {
    public long tiempo;
    public long tiempoIni;
    
    public PotenciometroTemporizado(float[] valores, long latencia) {
        super(valores);
        tiempo=latencia;
    }
    public PotenciometroTemporizado(int pos, float min, float incremento, long latencia) {
        super(pos,min,incremento);
        tiempo=latencia;
    }
    public void subir() {
        super.subir();
        tiempoIni=System.currentTimeMillis();
    }
    public void bajar() {
        super.bajar();
        tiempoIni=System.currentTimeMillis();
    }
    public int posicion() {
        if(System.currentTimeMillis()>=tiempo+tiempoIni)
            apagar();
        return aguja;
    }
    public float potencia() {
        if(System.currentTimeMillis()>=tiempo+tiempoIni)
            apagar();
        return potencia[aguja];
    }
    public long tiempo() {
        return tiempoIni;
    }
}