package service;

import java.util.List;

import dao.TarefaDAO;
import model.Tarefa;

public class TarefaService {
	
	public List<Tarefa> listar(){
		TarefaDAO dao = new TarefaDAO();
		return dao.listar();
	}
	
	public Tarefa buscaPorId(Integer id) {
		TarefaDAO dao = new TarefaDAO();
		return dao.buscarPorId(id);
	}
	
	public List<Tarefa> buscaPorDescricao(String descricao) {
		TarefaDAO dao = new TarefaDAO();
		return dao.buscaPorDescricao(descricao);
	}
	
	public boolean incluirTarefa(Tarefa tarefa){
		TarefaDAO dao = new TarefaDAO();
		return dao.incluir(tarefa);
	}
	
	public boolean alterarTarefa(Tarefa tarefa){
		TarefaDAO dao = new TarefaDAO();
		return dao.alterar(tarefa);
	}
	
	public boolean excluirTarefa(Tarefa tarefa){
		TarefaDAO dao = new TarefaDAO();
		return dao.excluir(tarefa);
	}
}
