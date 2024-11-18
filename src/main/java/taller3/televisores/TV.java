package taller3.televisores;

public class TV{
    public Marca marca;
    private int canal =1;
    public int precio=500;
    public Boolean estado;
    private int volumen=1;
    private Control control;
    public static int numTV=0;

    public TV(Marca marca, Boolean estado){
        this.marca=marca;
        this.estado=estado;
        nuevoTV();
    }
    public static void setNumTV(int num){numTV=num;}
    public static int getNumTV(){return numTV;}

    public void setCanal(int canal){
        if(estado && (canal>=1&&canal<=120)){this.canal=canal;}}
    public int getCanal(){return canal;}
    public void setPrecio(int precio){this.precio=precio;}
    public int getPrecio(){return precio;}
    public void setVolumen(int volumen){
        if(estado&&(volumen>=0&&volumen<=7)){this.volumen = volumen;}}
    public int getVolumen(){return volumen;}
    public void setMarca(Marca marca){this.marca=marca;}
    public Marca getMarca(){return marca;}
    public void setControl(Control control){this.control=control;}
    public Control getControl(){return control;}

    private static void nuevoTV(){
        numTV++;
    }

    public void turnOn(){estado = true;}
    public void turnOff(){estado = false;}
    public Boolean getEstado(){return estado;}

    public void canalUp(){
        if (canal<120 && estado) {++canal;}}
    public void canalDown(){
        if (canal>1 && estado){--canal;}
    }
    public void volumenUp(){
        if(volumen<7 && estado){++volumen;}
    }
    public void volumenDown(){
        if(volumen>0 && estado){--volumen;}
    }

}