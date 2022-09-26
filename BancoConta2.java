import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BancoConta2 extends ContaBanco {

	public static void main(String[] args) {
		
		ContaBanco contaBanco = new ContaBanco();
		
		Scanner scanner = new Scanner(System.in);
		
		contaBanco.login();
        
        if(contaBanco.senha == 123)
        {
        
        contaBanco.informacoes();
        contaBanco.opcoes();
        
        }
        else
	    {
	    	  System.out.println("\n-----------------");
			  System.out.println("|Senha Incorreta|");
			  System.out.println("-----------------");
	    }
        
    }
	
}



