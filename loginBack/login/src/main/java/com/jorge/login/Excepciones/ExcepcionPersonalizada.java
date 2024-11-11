package com.jorge.login.Excepciones;

public class ExcepcionPersonalizada extends RuntimeException {

    // Constructor con un mensaje de error
    public ExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }

    // Constructor con un mensaje de error y la causa (por ejemplo, un NullPointerException)
    public ExcepcionPersonalizada(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
