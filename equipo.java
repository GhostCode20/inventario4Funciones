/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author AP-SE105-01
 */
public class equipo {
    private int codigo;
    private String descripcion;
    private String procesador;
    private String marca;
    private int cantidad;
    private int ram;
     private int almacenamiento;

    public equipo(int codigo, String descripcion, String procesador, String marca, int cantidad, int ram, int almacenamiento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.procesador = procesador;
        this.marca = marca;
        this.cantidad = cantidad;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    
     
}
