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
		  
		  Tarefa tarefaIncluir = new Tarefa();
		  tarefaIncluir.setDescricao("Comer biscoito");
		  tarefaIncluir.setPrazo(1);
		  tarefaIncluir.setFinalizada(false);
		  
		  System.out.println("-----------------------------------------------------------------------");
		  
		  if(service.incluirTarefa(tarefaIncluir)) {
			  System.out.println("Registro incluído com sucesso!");
		  } else {
			  System.out.println("Ocorreu algum erro");
		  }
		  
		  Tarefa alterarTarefa = new Tarefa();
		  alterarTarefa.setDescricao("Comer biscoito recheado");
		  alterarTarefa.setPrazo(1);
		  alterarTarefa.setFinalizada(false);
		  alterarTarefa.setId(12);
		  
		  System.out.println("-----------------------------------------------------------------------");
		  
		  if(service.incluirTarefa(tarefaIncluir)) {
			  System.out.println("Registro incluído com sucesso!");
		  } else {
			  System.out.println("Ocorreu algum erro");
		  }
		  
		  Tarefa excluirTarefa = new Tarefa();
		  excluirTarefa.setDescricao("Comer biscoito");
		  excluirTarefa.setPrazo(1);
		  excluirTarefa.setFinalizada(false);
		  
		  System.out.println("-----------------------------------------------------------------------");
		  
		  if(service.incluirTarefa(tarefaIncluir)) {
			  System.out.println("Registro incluído com sucesso!");
		  } else {
			  System.out.println("Ocorreu algum erro");
		  }
	}
}
