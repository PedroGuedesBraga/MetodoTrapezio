package fisicaTrabalho;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Trapezio {

	public static double funcao(double numero, String funcao){
		Expression e = new ExpressionBuilder(funcao)
				.variable("x")
				.build()
				.setVariable("x", numero);
			return e.evaluate();
	}
	
	
	public static double calculaIntegral(double a, double b, double n, String funcao){

		double h = (b-a)/n;
		double resultado = 0;
		double x = a; //Onde comeca a calcular a altura, variavel de incremento
		
		for (int i = 0; i < n; i++){
			resultado += (funcao(x, funcao) + funcao(x+h, funcao)) * h/2;
			x = x + h;
		}
		
		return resultado;	
		
	}
	
	
	public static void main(String[] args) {
		Trapezio trapezio = new Trapezio();
		
		System.out.println(calculaIntegral(1,2,200000,"x^9"));
	}
}
