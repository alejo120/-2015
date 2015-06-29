/*
 Document   : Aviones
 Created on : 07/05/2015, 04:08:29 PM
 Author     : Alejandro Diez
 */
package Entidades;

/* 
 *AvionEnt
 *Defino cada uno de los campos de la lista
 *Estos campos los igualo a null
 */

public class AvionEnt {

    public String Codigo;
    public String Capacidad;
    public String Estado;
    public AvionEnt Liga;

    public AvionEnt() {
        Codigo = null;
        Capacidad = null;
        Estado = null;
        Liga = null;
    }

    public AvionEnt(String Codigo, String Capacidad, String Estado) {
        this();
        this.Codigo = Codigo;
        this.Capacidad = Capacidad;
        this.Estado = Estado;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public AvionEnt getLS() {
        return Liga;
    }

    public void setLS(AvionEnt LS) {
        this.Liga = Liga;
    }
}
