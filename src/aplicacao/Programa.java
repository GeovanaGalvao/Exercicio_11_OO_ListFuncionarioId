package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		List <Funcionario> listaDeFuncionarios = new ArrayList<>();
		int quantidadeDeFuncionariosACadastrar;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Por favor digite a quantidade de funcionarios que gostaria de cadastrar: ");
			quantidadeDeFuncionariosACadastrar = sc.nextInt();
			sc.nextLine();
			if (quantidadeDeFuncionariosACadastrar <= 0 || quantidadeDeFuncionariosACadastrar > 1000) {
				System.out.println("Valor inserido invalido!");}
		} while (quantidadeDeFuncionariosACadastrar <= 0 || quantidadeDeFuncionariosACadastrar > 1000);
		
		//Esse trecho cria o funcionario e o adiciona diretamente na lista.
		for (int i=0; i < quantidadeDeFuncionariosACadastrar; i++) {
			Funcionario.adicionaFuncionariosALista(listaDeFuncionarios, new Funcionario(
					Funcionario.obtemId(listaDeFuncionarios), Funcionario.obtemNome(), 
					Funcionario.obtemSalario()));
			System.out.println("\nFuncionario cadastrado com sucesso!");
			System.out.println("\n-------------------------------------\n");
		}
		System.out.println("Por hoje eh so pessoal!");
		sc.close();
	}
}
