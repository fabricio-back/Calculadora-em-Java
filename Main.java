import java.util.Scanner;

class Calculador{
  private float valor1;
  private float valor2;
  private float resultado;
  private String operacao;
  public boolean termina = false;

  
  public float getValor1() {
  return valor1;
  }
  
  public void setValor1(float valor1) {
  this.valor1 = valor1;
  }
  
  public float getValor2() {
  return valor2;
  }
  
  public void setValor2(float valor2) {
  this.valor2 = valor2;
  }
  
  public float getResultado() {
  return resultado;
  }
  
  public void setResultado(float resultado,String operacao, float valor1, float valor2) {
  this.resultado = resultado;
  System.out.println("Escolha o calculo é: "+valor1+" "+operacao+" "+valor2);
  System.out.println("O resultado é " + resultado + "\n============================"); 
  }
  
  public String getOperacao() {
  return operacao;
  }
  
  public void setOperacao(String operacao, float valor1, float valor2) {
    if (operacao.equals("+")){
      setResultado(valor1 + valor2, operacao, valor1, valor2);
    }
    else if (operacao.equals("-")){
      setResultado(valor1 - valor2, operacao, valor1, valor2);
    }
    else if (operacao.equals("*")){
      setResultado(valor1 * valor2, operacao, valor1, valor2);
    }
    else if (operacao.equals("/")){
      setResultado(valor1 / valor2, operacao, valor1, valor2);
    }
    
  }
 
}


class Main {
  public static void main(String[] args) {
   Calculador C1 = new Calculador();
   Scanner entrada = new Scanner (System.in);
    while(!C1.termina){
        
      
    System.out.println("\nCALCULADOR BETA \n Escolha a operação deseja calcular \n • opções +,-,*,/ \n • Para sair digite 0.\n "); 
      
    String operacao = entrada.nextLine();

      
      if (operacao.equals("0")){
      C1.termina = true;
      System.out.println("Obrigado por usar esta calculadora"); 
      break;
      }
      
      System.out.println("Qual o primeiro valor"); 
    float valor1 = entrada.nextFloat();
      
      System.out.println("Qual o Segundo valor"); 
    float valor2 = entrada.nextFloat();
      entrada.nextLine();
      
    C1.setOperacao(operacao, valor1, valor2);
    }
    entrada.close();
  }
}