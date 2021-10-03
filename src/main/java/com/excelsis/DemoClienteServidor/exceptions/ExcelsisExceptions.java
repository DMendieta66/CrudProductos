package com.excelsis.DemoClienteServidor.exceptions;

public class ExcelsisExceptions extends Exception{

        private static final long serialVersionUID = 3230061859863400898L;

        /**
         * Constructor para inicializar la excepcion.
         **/
        public ExcelsisExceptions(String mensaje, Throwable throwable) {
            super(mensaje, throwable);
        }
    }

