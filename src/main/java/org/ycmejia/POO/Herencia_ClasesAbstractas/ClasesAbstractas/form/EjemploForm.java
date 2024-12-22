package org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form;

import org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form.elementos.ElementosForm;
import org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form.elementos.InputForm;
import org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form.elementos.SelectForm;
import org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form.elementos.TextAreaForm;
import org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form.elementos.select.Opcion;
import org.ycmejia.POO.Herencia_ClasesAbstractas.ClasesAbstractas.form.validador.*;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username= new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password= new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador());
        InputForm email= new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());
        InputForm edad= new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());


        TextAreaForm experiencia= new TextAreaForm("exp", 5,9);

        SelectForm lenguaje= new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        Opcion java= new Opcion("1", "JAVA");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3","JavaScript"));
        lenguaje.addOpcion(new Opcion("4","TypeScript"));
        lenguaje.addOpcion(new Opcion("5","PHP"));

        ElementosForm saludar= new ElementosForm("Saludao") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"'value =\""+ this.valor + "\">";
            }
        };

        saludar.setValor("Hola este campo esta deshabilitado");
        username.setValor("camilo.doe");
        password.setValor("Familia");
        email.setValor("camilo@gmail.com");
        edad.setValor("27");
        experiencia.setValor("Menos de 10 años de experiencia");
        java.setSeleccionado(true);

        List<ElementosForm> elementos= new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);


        elementos.forEach(e->{;
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
        elementos.forEach(e->{
            if(!e.esValidado()){
                e.getErrores().forEach(System.out::println);
                }
            });
        }

    }

