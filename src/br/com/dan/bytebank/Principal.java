package br.com.dan.bytebank;

import br.com.dan.bytebank.model.Funcionario;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Bem Vindo ao ByteBank!");

        Funcionario jose = new Funcionario("José", 1, LocalDate.of(1990,2,12));
        System.out.println(jose);



    }
}