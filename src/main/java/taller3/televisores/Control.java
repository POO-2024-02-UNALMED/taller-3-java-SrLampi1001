package taller3.televisores;

public class Control{
    private TV tv;

    public TV getTv(){return tv;}
    public void setTv(TV tv){this.tv=tv;}
    
    public void turnOn(){tv.turnOn();}
    public void turnOff(){tv.turnOff();}
    public void canalUp(){tv.canalUp();}
    public void canalDown(){tv.canalDown();}
    public void volumenUp(){tv.volumenUp();}
    public void volumenDown(){tv.volumenDown();}
    public void setCanal(int canal){
        if((canal<=120)&&(canal>=1)&&tv.estado){
            tv.setCanal(canal);}}
    public void setVolumen(int volumen){
        if((volumen<=7&&volumen>=0)&&tv.estado){
        tv.setVolumen(volumen);}}
    
    public void enlazar(TV tv){
        setTv(tv);
        tv.setControl(this);
    }

}