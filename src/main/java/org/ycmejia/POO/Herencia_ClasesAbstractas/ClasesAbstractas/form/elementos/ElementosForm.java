package org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form.elementos;

import org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementosForm {
    protected  String valor;
    protected String nombre;
    private List<Validador> validadores;
    private List<String> errores;

    public ElementosForm() {
        this.validadores= new ArrayList<>();
        this.errores= new ArrayList<>();
    }

    public ElementosForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementosForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public boolean esValidado(){
        for(Validador v:validadores){
            if(!v.esValido(this.valor)){
                this.errores.add(v.getMensaje());
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();

}
