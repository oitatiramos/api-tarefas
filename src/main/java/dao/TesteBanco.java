package dao;

import java.sql.Connection;
import java.util.List;

import model.Tarefa;

public class TesteBanco {

	public static void main(String[] args) {
		Connection conexao = Dao.getConexao();
		
		TarefaDAO banco = new TarefaDAO();
		List<Tarefa> lista = banco.listar();
		
		for(Tarefa t: lista) {
			System.out.println(t);
		}
	}
}
