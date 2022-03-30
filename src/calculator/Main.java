package calculator;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r1, r2;
     
		Scanner leitura = new Scanner (System.in);
		
		System.out.println ("Digite o valor 1");
		r1 = leitura.nextDouble();
		
		System.out.println ("Digite o valor 2");
		r2 = leitura.nextDouble();
		
		Calc calc = new Calc();
		
		
			System.out.println("1-somar");
			System.out.println("2-subtracao");
			System.out.println("3-multiplicacao");
			System.out.println("4-divisao");
			
			int opcao;
			System.out.println ("Selecione a opçao: ");
			opcao = leitura.nextInt();
            switch(opcao) {
            case 1:    	
            	System.out.println("somar: " + calc.sum(r1, r2));
                break;
            case 2:
            	System.out.println("subtracao: " + calc.sub(r1, r2));
                break;
            case 3:
            	System.out.println("multiplicacao: " + calc.mult(r1, r2));
                break;
            case 4:
            	System.out.println("divisao: " + calc.div(r1, r2));
                break;
            case 5:
                System.out.println("Tenha uma ótima noite! Obrigado por usar nossa revolucionaria calculadora!");
                break;
                    default:
                        System.out.println("Opção Inválida");
                        
            }
		}

	
	
	}

