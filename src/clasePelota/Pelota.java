package clasePelota;

public class Pelota {
    private String color;
    private double diametro;
    private int rebotes;
    public Pelota(String color, double diametro){
        this.color = color;
        this.diametro = diametro;
        this.rebotes = 0;
    }
    public void rebotar(){
        rebotes += 1;
    }
    public int getRebotes(){
        return rebotes;
    }
    public void reiniciar(){
        rebotes = 0;
    }
}
