package org.juarezsanta.bean;

public abstract class Dispositivo {
    protected String modelo;
    protected String marca;
    protected int anio;
    
    public  Dispositivo(String modelo,String marca,int anio){
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void mostrarInformacion(){
            System.out.println("a");
            System.out.println("marca"+ marca);
            System.out.println("modelo"+ modelo  );
            System.out.println("año"+ anio);
        }
    
        public abstract void encender();
    
        public  void encender(int voltaje){
            System.out.println("el dispositivo prende con este voltaje"+ voltaje + "V");
        }
    
}