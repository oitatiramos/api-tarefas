package dao;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import model.Tarefa;
import service.TarefaService;

public class TesteBanco {

	public static void main(String[] args) {
		Connection conexao = Dao.getConexao();
		
		TarefaService service = new TarefaService();
		
		  List<Tarefa> lista = service.listar();
		  for(Tarefa t: lista) { System.out.println(t); }
		 
		  System.out.println("-----------------------------------------------------------------------");
		  
		  // CONSULTA
		  /*
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Qual tarefa você quer consultar?");
		  int criterio = scanner.nextInt();
		  System.out.println(service.buscaPorId(criterio));
		  
		  System.out.println("-----------------------------------------------------------------------");
		  
		  Scanner teclado = new Scanner(System.in);
		  System.out.println("Qual tarefa você quer consultar(descricao)?");
		  String descricao = teclado.nextLine();
		  
		  List<Tarefa> lista2 = service.buscaPorDescricao(descricao);
		  
		  for(Tarefa t2: lista2) { System.out.println(t2);
		  }
		  
		  System.out.println("-----------------------------------------------------------------------");
		  */
		
		  //INCLUSÃO
		  /*
		  Tarefa tarefaIncluir = new Tarefa();
		  tarefaIncluir.setDescricao("Comer biscoito"); tarefaIncluir.setPrazo(1);
		  tarefaIncluir.setFinalizada(false);
			 
		  if(service.incluirTarefa(tarefaIncluir)) {
			  System.out.println("Registro incluído com sucesso!"); 
			  } else {
				  System.out.println("Ocorreu algum erro"); 
				  }
		  
		  System.out.println("-----------------------------------------------------------------------");
			 */
		
			// EXCLUSÃO
		  	/*
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Qual tarefa você quer excluir?"); 
			int criterio2 = scanner2.nextInt();
			  
			Tarefa t = new Tarefa();
			  
			t = service.buscaPorId(criterio2);
			  
			if(service.excluirTarefa(t)) { System.out.println("Excluído com sucesso!"); }
			else { System.out.println("Ocorreu algum erro"); }
			 */
		  
		  // ALTERAÇÃO 
		  
	}
}
