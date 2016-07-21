
import javax.swing.JOptionPane;  
public class Porcentagem{
	public static void main(String [ ] args){

		float valor, dinheiros, formula;
		valor = Float.parseFloat(JOptionPane.showInputDialog(null,"R$ Valor do produto"));  
        dinheiros = Float.parseFloat(JOptionPane.showInputDialog(null,"Juros"));
        formula = valor*(1+(dinheiros/100));
        JOptionPane.showMessageDialog(null, "Dinheiros final = "+formula+" com "+dinheiros+"% de juros.");

	}
}