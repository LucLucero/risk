package br.com.risk.checkup.exceptions;


public class UserFoundException extends RuntimeException{

    public UserFoundException() {
        super("Usuário já cadastrado");
    }

}
