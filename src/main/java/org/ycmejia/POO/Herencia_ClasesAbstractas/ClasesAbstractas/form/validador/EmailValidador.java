package org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje="El campo %s tiene unformato de correo es invalido";

    private final static String EMAIL_REGEX="^(.+)@(.+)$";//Expresion regular
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
