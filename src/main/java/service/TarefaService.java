package service;

import java.util.List;

import dao.TarefaDAO;
import model.Tarefa;

public class TarefaService {
	
	public List<Tarefa> listar(){
		TarefaDAO dao = new TarefaDAO();
		return dao.listar();
	}
}
