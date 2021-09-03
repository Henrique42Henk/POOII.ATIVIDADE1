package App;
import javax.swing.JOptionPane;


public class Concessionaria {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		Moto moto1 = new Moto();
		
		carro1.setMarca(JOptionPane.showInputDialog("Marca do carro: "));
		carro1.setNome(JOptionPane.showInputDialog("Nome modelo do carro: "));
		carro1.setCor(JOptionPane.showInputDialog("Cor do carro: "));
		carro1.setPlaca(JOptionPane.showInputDialog("Placa do carro: "));
		
		
		moto1.setMarca(JOptionPane.showInputDialog("Marca da moto: "));
		moto1.setNome(JOptionPane.showInputDialog("Nome modelo da moto: "));
		moto1.setCor(JOptionPane.showInputDialog("Cor da moto: "));
		moto1.setPlaca(JOptionPane.showInputDialog("Placa da moto: "));

		
	}

}
