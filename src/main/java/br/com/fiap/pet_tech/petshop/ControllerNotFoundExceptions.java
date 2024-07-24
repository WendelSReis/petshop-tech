package br.com.fiap.pet_tech.petshop;

public class ControllerNotFoundExceptions extends RuntimeException {

    public ControllerNotFoundExceptions(String message) {
        super(message);
    }
}
