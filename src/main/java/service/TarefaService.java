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
}
