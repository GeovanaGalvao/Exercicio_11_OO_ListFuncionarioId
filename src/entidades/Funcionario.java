package entidades;

import java.util.List;
import java.util.Scanner;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public static void adicionaFuncionariosALista(List<Funcionario> listaDeFuncionarios,
			Funcionario funcionario) { listaDeFuncionarios.add(funcionario); }
	
	public static int obtemId(List<Funcionario> listaDeFuncionarios){
		int id;
		Scanner scan = new Scanner (System.in);
		do {
			System.out.print("Por favor digite o id do funcionario: ");
			id = scan.nextInt();
			scan.nextLine();
			if (listaDeFuncionarios.isEmpty()) { break; }
			else if (!validaId(listaDeFuncionarios, id)) {
				System.out.println("O valor de id digitado ja esta em uso! Insira um valor valido!\n");
			}
		} while (!validaId(listaDeFuncionarios, id));
		return id;
	}
	
	public static boolean validaId (List<Funcionario> listaDeFuncionarios,int id) {
		for (Funcionario funcionario : listaDeFuncionarios) {
			if (funcionario.getId() == id) { return false; }
		}
		return true;
	}
	
	public static String obtemNome() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Por favor digite o nome do funcionario: ");
		String nome = scan.nextLine();
		return nome;
	}
	
	public static double obtemSalario() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Por favor digite o salario do funcionario: ");
		double salario = scan.nextDouble();
		scan.nextLine();
		return salario;
	}

	public int getId() { return id; }
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public double getSalario() { return salario; }
	
	public String toString () {return getId() + ", " + getNome() + ", R$:" + getSalario();}
}
