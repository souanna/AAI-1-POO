package br.com.fecaf.model;
import java.util.Scanner;

public class Retangulo {
    public double lado1, lado2, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarRetangulo() {
        System.out.println("/*********************/");
        System.out.println("/* Cadatro do Retangulo*/");
        System.out.println(/*********************/);
        System.out.println("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("/*********************/");

        return true;
    }

    public void exibirRetangulo() {
        System.out.println("/*** Exibir Retângulo ***/");
        System.out.println("O lado 1 é: " + lado1);
        System.out.println("O lado 2 é: " + lado2);
        System.out.println("A área é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*********************/");
    }

    public void calcularArea() {
        System.out.println("/* Calculando Área */");
        area = lado1 * lado2;
        System.out.println("Àrea é igual: " + area);
    }

    public void calcularPerimetro() {
        System.out.println("/* Calculando Perimetro */");
        perimetro = 2 * lado1 + lado2;
        System.out.println("Perímetro é igual: " + perimetro);
    }

    public boolean validarQuadrado(){
        System.out.println("Definindo se é um quadrado.");
        if (lado1 == lado2) {
            System.out.println("É um quadrado.");
            return true;
        }
        return false;
    }
}