package com.jorge.login.Excepciones;

public class ExcepcionNullPointer extends ExcepcionPersonalizada {

    // Constructor con un mensaje específico para NullPointerException
    public ExcepcionNullPointer(String mensaje) {
        super(mensaje);
    }

    // Constructor con un mensaje específico y la causa de la excepción
    public ExcepcionNullPointer(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
