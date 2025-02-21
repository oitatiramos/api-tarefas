package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Tarefa;

public class TarefaDAO {
	
	public List<Tarefa> listar(){
		List<Tarefa> lista = new ArrayList<Tarefa>();
		
		Tarefa tarefa = null;
		
		Connection cnx = Dao.getConexao();
		
		String SQL = "SELECT * FROM tarefas";
		
		PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(SQL);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				tarefa = new Tarefa();
				tarefa.setId(rs.getInt("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setPrazo(rs.getInt("prazo"));
				tarefa.setFinalizada(rs.getBoolean("finalizada"));
				
				lista.add(tarefa);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	public Tarefa buscarPorId(Integer id) {
	    Tarefa tarefa = null;
	    
	    Connection cnx = Dao.getConexao();
	    
		String SQL = "SELECT * FROM tarefas WHERE id = ?";
	    
	    try {
	        PreparedStatement ps = cnx.prepareStatement(SQL);
	        
	        ps.setInt(1, id);
	        
	        ResultSet rs = ps.executeQuery();
	        
	        if (rs.next()) {
	            tarefa = new Tarefa();
	            tarefa.setId(rs.getInt("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setPrazo(rs.getInt("prazo"));
				tarefa.setFinalizada(rs.getBoolean("finalizada"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return tarefa;
	}	
	
	public List<Tarefa> buscaPorDescricao(String descricao){
		List<Tarefa> lista = new ArrayList<Tarefa>();
		
		Tarefa tarefa = null;
	    
	    Connection cnx = Dao.getConexao();
	    
	    String SQL = "SELECT * FROM tarefas WHERE descricao LIKE '?%'";
	    
	    PreparedStatement ps;
		
		try {
			ps = cnx.prepareStatement(SQL);
			
			ps.setString(1, descricao);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				tarefa = new Tarefa();
				tarefa.setId(rs.getInt("id"));
				tarefa.setDescricao(rs.getString("descricao"));
				tarefa.setPrazo(rs.getInt("prazo"));
				tarefa.setFinalizada(rs.getBoolean("finalizada"));
				
				lista.add(tarefa);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
}
