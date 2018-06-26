package Pacote_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MateriaDao {

	public List<Materia> getMaterias(){
		List<Materia> materia = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.materia";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_materia");
				String curso = resultSet.getString("curso");
				double valor = resultSet.getDouble("valor");
				
				Materia m = new Materia();
				m.setId_materia(id);
				m.setCurso(curso);
				m.setValor(valor);
				materia.add(m);
				
			}
			for(Materia f:materia) {
				System.out.println(f);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return materia;
	}
	public List<Materia2> getMaterias2(){
		List<Materia2> materia = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.materia";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_materia");
				String curso = resultSet.getString("curso");
				
				Materia2 m = new Materia2();
				m.setId_materia(id);
				m.setCurso(curso);
				materia.add(m);
				
			}
			for(Materia2 f:materia) {
				System.out.println(f);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return materia;
	}
	public void salvar(Materia materia) {
		Connection connection = ConnectionFactory.getConection();
		String sql = "insert into sistema.materia(curso,valor) values(?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, materia.getCurso());
			ps.setDouble(2, materia.getValor());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String alterar(Materia materia) {
		Connection connection = ConnectionFactory.getConection();
		try {
		String sql = "update sistema.materia set curso="+"'"+materia.getCurso()+"'"+", valor="+materia.getValor() 
		+" where id_materia="+materia.getId_materia();
		PreparedStatement ps = connection.prepareStatement(sql);
		System.out.println("Conectado com Sucesso!");
		//ps.executeQuery();
		ps.executeUpdate(sql);
		ps.close();
		connection.close();
		
		} catch( Exception e) {
			e.printStackTrace();
		}
		return materia.getId_materia()+materia.getCurso()+materia.getValor();
	}
	
	public int getExcluir(int id) {
		
		Connection connection = ConnectionFactory.getConection();
		

		try {
			
			String sql ="delete from sistema.materia where id_materia=?";
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
}
