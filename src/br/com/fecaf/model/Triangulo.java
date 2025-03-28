package br.com.fecaf.model;
import java.util.Scanner;

public class Triangulo {

    public double base, altura, lado2, lado3, area, perimetro, coposto,cadjacente,soma, hipotenusa;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo () {
        System.out.println("/*************************/");
        System.out.println("/* Cadastrando Triângulo */");
        System.out.println("/*************************/");
        System.out.println("/* Informe a base: */");
        base = scanner.nextDouble();
        System.out.println("/* Informe o lado 2: */");
        lado2 = scanner.nextDouble();
        System.out.println("/* Informe o lado 3: */");
        lado3 = scanner.nextDouble();
        System.out.println("/* Informe a altura: */");
        altura = scanner.nextDouble();
        System.out.println("/*************************/");

        return true;
    }

    public void calcularArea () {
        System.out.println("/*************************/");
        System.out.println("/* Calculando Area */");
        System.out.println("/*************************/");

        area = (base * altura)/2;
        System.out.println("Área é igual: " + area);
        System.out.println("/*************************/");
    }

    public void calcularPerimetro () {
        System.out.println("/*************************/");
        System.out.println("/* Calculando Perímetro */");
        System.out.println("/*************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("Perímetro é igual: " + perimetro);
        System.out.println("/*************************/");
    }

    /** Definir tipo de triângulo*/
    /** Equilatero - Escaleno - Isósceles*/

    public void definirTipo () {
        System.out.println("/*************************/");
        System.out.println("/* Definindo Tipo Triângulo */");
        System.out.println("/*************************/");

        if (base == lado2 && base == lado3) {
            System.out.println("Esse triângulo é Equilatero...");
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Esse triâgulo é um Escaleno...");
        } else {
            System.out.println("Esse triâgulo é um Isósceles");
        }
    }

    public void detectarTriangulo (){

        System.out.println("/*************************/");
        System.out.println("/* Detectando o tipo de triângulo...*/");
        System.out.println("/*************************/");
        System.out.print("Informe o valor do cateto oposto: ");
        lado2 = scanner.nextDouble();
        System.out.println("Informe o valor do cateto adjacente: ");
        lado3 = scanner.nextDouble();

        //Calculando os catetos:
        coposto = lado2 * lado2;
        cadjacente = lado3 * lado3;
        soma = coposto + cadjacente;

        //Calculando a hipotenusa:
        hipotenusa = Math.sqrt(soma);
        System.out.println("O valor da hipotenusa é: " + hipotenusa);

        // Verificando se é um triângulo retângulo:
        if (Math.abs(coposto + cadjacente - soma) < 0.0001) {
                System.out.println("É um triângulo retângulo.");
            } else {
                System.out.println("Não é um triângulo retângulo.");
            }

    }
}
