/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author aleja
 */
public class Profesores {
    
    String CC, nombre, apellido, cargo, estado_civil, eps, modalidad, fecha_inicio, fecha_fin, bono_hijo, bono_internet;

    
    double salario, horas_trabajadas, valor_ahorro, bono_h_t_30, bono_c_5, bono_i, neto_pagar, cant_hijos;

    public Profesores() {
    }
    
    public Profesores(String CC, String apellido, String cargo, String estado_civil, String eps, String bono_hijo, double salario, double horas_trabajadas, double valor_ahorro, double bono_h_t_30, double bono_c_5, double neto_pagar, double cant_hijos) {
        this.CC = CC;
        this.apellido = apellido;
        this.cargo = cargo;
        this.estado_civil = estado_civil;
        this.eps = eps;
        this.bono_hijo = bono_hijo;
        this.salario = salario;
        this.horas_trabajadas = horas_trabajadas;
        this.valor_ahorro = valor_ahorro;
        this.bono_h_t_30 = bono_h_t_30;
        this.bono_c_5 = bono_c_5;
        this.neto_pagar = neto_pagar;
        this.cant_hijos = cant_hijos;
    }

    public Profesores(String CC, String nombre, String apellido, String cargo, String eps, String modalidad, String fecha_inicio, String fecha_fin, String bono_internet, double salario, double horas_trabajadas, double bono_i, double neto_pagar) {
        this.CC = CC;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.eps = eps;
        this.modalidad = modalidad;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.bono_internet = bono_internet;
        this.salario = salario;
        this.horas_trabajadas = horas_trabajadas;
        this.bono_i = bono_i;
        this.neto_pagar = neto_pagar;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getBono_hijo() {
        return bono_hijo;
    }

    public void setBono_hijo(String bono_hijo) {
        this.bono_hijo = bono_hijo;
    }

    public String getTitular_casado() {
        return titular_casado;
    }

    public void setTitular_casado(String titular_casado) {
        this.titular_casado = titular_casado;
    }

    public String getBono_internet() {
        return bono_internet;
    }

    public void setBono_internet(String bono_internet) {
        this.bono_internet = bono_internet;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double getValor_ahorro() {
        return valor_ahorro;
    }

    public void setValor_ahorro(double valor_ahorro) {
        this.valor_ahorro = valor_ahorro;
    }

    public double getBono_h_t_30() {
        return bono_h_t_30;
    }

    public void setBono_h_t_30(double bono_h_t_30) {
        this.bono_h_t_30 = bono_h_t_30;
    }

    public double getBono_c_5() {
        return bono_c_5;
    }

    public void setBono_c_5(double bono_c_5) {
        this.bono_c_5 = bono_c_5;
    }

    public double getBono_i() {
        return bono_i;
    }

    public void setBono_i(double bono_i) {
        this.bono_i = bono_i;
    }

    public double getNeto_pagar() {
        return neto_pagar;
    }

    public void setNeto_pagar(double neto_pagar) {
        this.neto_pagar = neto_pagar;
    }

    public double getCant_hijos() {
        return cant_hijos;
    }

    public void setCant_hijos(double cant_hijos) {
        this.cant_hijos = cant_hijos;
    }
     
}


