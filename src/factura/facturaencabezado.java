/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CARLOS VALLE
 */
public class facturaencabezado {
   int Serie;
    int Numero;
    String Fecha;
    String Nombre;
    String Direccion;
    int Nit;
    double Total;
    List<facturaencabezado> descripcion = new ArrayList();

    public facturaencabezado() {
    }

    public facturaencabezado(int Serie, int Numero, String Fecha, String Nombre, String Direccion, int Nit) {
        this.Serie = Serie;
        this.Numero = Numero;
        this.Fecha = Fecha;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Nit = Nit;
    }

    
    public int getSerie() {
        return Serie;
    }

    public void setSerie(int Serie) {
        this.Serie = Serie;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

   

    
}
