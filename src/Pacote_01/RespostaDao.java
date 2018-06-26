package Pacote_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RespostaDao {
int aux;
	public int getAux() {
	return aux;
}

public void setAux(int aux) {
	this.aux = aux;
}

	public void salvar(Resposta resposta) {
		Connection connection = ConnectionFactory.getConection();
		String sql = "insert into sistema.resposta(id_auxiliar,resposta1,resposta2,correcao) values(?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, resposta.getId_auxiliar());
			ps.setString(2, resposta.getResposta1());
			ps.setString(3, resposta.getResposta2());
			ps.setBoolean(4, resposta.getCorrecao());
			System.out.println("Conectado com sucesso!");
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public String alterar(Resposta resposta) {
		Connection connection = ConnectionFactory.getConection();
		try {
		String sql = "update sistema.resposta set id_auxiliar="+resposta.getId_auxiliar()+ ",resposta1="+"'"+resposta.getResposta1()+"'"+", resposta2="+"'"+resposta.getResposta2() +"'"+",correcao="+resposta.getCorrecao()+" where id_resposta="
				+resposta.getId_resposta();
		PreparedStatement ps = connection.prepareStatement(sql);
		System.out.println("Conectado com Sucesso!");
		//ps.executeQuery();
		ps.executeUpdate(sql);
		ps.close();
		connection.close();
		
		} catch( Exception e) {
			e.printStackTrace();
		}
		return resposta.getId_resposta()+resposta.getId_auxiliar()+resposta.getResposta1()+resposta.getResposta2()+resposta.getCorrecao();
	}
	
	public List<Resposta> getRespostas(){
		List<Resposta> respostas = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.resposta";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_resposta");
				Integer id2 = resultSet.getInt("id_auxiliar");
				String resposta1 = resultSet.getString("resposta1");
				String resposta2 = resultSet.getString("resposta2");
				boolean correcao = resultSet.getBoolean("correcao");
				
				Resposta resposta = new Resposta();
				resposta.setId_resposta(id);
				resposta.setId_auxiliar(id2);
				resposta.setResposta1(resposta1);
				resposta.setResposta2(resposta2);
				resposta.setCorrecao(correcao);
				respostas.add(resposta);
				
			}
			for(Resposta a:respostas) {
				System.out.println(a);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return respostas;
	}
	
	public List<Resposta2> getRespostas2(){
		List<Resposta2> respostas = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.resposta where id_auxiliar="+aux+";";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_auxiliar");
				String resposta1 = resultSet.getString("resposta1");
				String resposta2 = resultSet.getString("resposta2");
				
				
				Resposta2 resposta = new Resposta2();
				resposta.setId_auxiliar(id);
				resposta.setResposta1(resposta1);
				resposta.setResposta2(resposta2);
				respostas.add(resposta);
				
			}
			for(Resposta2 a:respostas) {
				System.out.println(a);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return respostas;
	}
	
	public int getExcluir(int id) {
		Connection connection = ConnectionFactory.getConection();
		

		try {
			
			String sql ="delete from sistema.resposta where id_resposta=?";
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
}}
