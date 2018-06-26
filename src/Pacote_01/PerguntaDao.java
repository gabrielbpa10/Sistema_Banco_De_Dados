package Pacote_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PerguntaDao {
	int aux=1;
	
	
	public int getAux() {
		return aux;
	}

	public void setAux(int aux) {
		this.aux = aux;
	}

	public void salvar(Pergunta pergunta) {
		Connection connection = ConnectionFactory.getConection();
		String sql = "insert into sistema.pergunta(pergunta,fk_resposta) values(?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, pergunta.getPergunta());
			ps.setInt(2, pergunta.getFk_resposta());
			System.out.println("Conectado com sucesso!");
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public List<Pergunta> getPerguntas(){
		List<Pergunta> pergunta = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.pergunta";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_pergunta");
				String pergunta1 = resultSet.getString("pergunta");
				int fk_resposta = resultSet.getInt("fk_resposta");
				
				Pergunta pergunta11= new Pergunta();
				pergunta11.setId_pergunta(id);
				pergunta11.setPergunta(pergunta1);
				pergunta11.setFk_resposta(fk_resposta);
				pergunta.add(pergunta11);
				
			}
			for(Pergunta a:pergunta) {
				System.out.println(a);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return pergunta;
	}
	
	public String alterar(Pergunta pergunta) {
		Connection connection = ConnectionFactory.getConection();
		try {
		String sql = "update sistema.pergunta set pergunta="+"'"+pergunta.getPergunta()+"'"+", fk_resposta="+pergunta.getFk_resposta() +" where id_pergunta="
				+pergunta.getId_pergunta();
		PreparedStatement ps = connection.prepareStatement(sql);
		System.out.println("Conectado com Sucesso!");
		//ps.executeQuery();
		ps.executeUpdate(sql);
		ps.close();
		connection.close();
		
		} catch( Exception e) {
			e.printStackTrace();
		}
		return pergunta.getId_pergunta()+pergunta.getPergunta()+pergunta.getFk_resposta();
	}
	
	public int getExcluir(int id) {
		Connection connection = ConnectionFactory.getConection();
		

		try {
			
			String sql ="delete from sistema.pergunta where id_pergunta=?";
			PreparedStatement ps;
			ps = connection.prepareStatement(sql);
			System.out.println("Conectado com sucesso!");
			ps.setInt(1,id);
			ps.executeUpdate();
			ps.close();
			connection.close();

	
}catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
		return id;
		
	}
	
	public List<Pergunta2> getPerguntas2(){
		
		List<Pergunta2> pergunta = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.pergunta where id_pergunta="+aux+";";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_pergunta");
				String pergunta1 = resultSet.getString("pergunta");
				
				
				Pergunta2 pergunta11= new Pergunta2();
				pergunta11.setId_pergunta(id);
				pergunta11.setPergunta(pergunta1);
				pergunta.add(pergunta11);
				
			}
			for(Pergunta2 a:pergunta) {
				System.out.println(a);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return pergunta;
	}
}
