/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author CARLOS VALLE
 */
public class facturadescripcion {
 int Cantidad;
    String Descripcion;
    double valor;
    int total;

    public facturadescripcion() {
    }

    public facturadescripcion(int Cantidad, String Descripcion, double valor) {
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.valor = valor;
        
    }
    
    

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTotal() {
        return total;
    }

  
    
}
