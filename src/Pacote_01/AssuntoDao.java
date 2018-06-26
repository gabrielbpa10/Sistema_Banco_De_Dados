package Pacote_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AssuntoDao {

	
	public void salvar(Assunto assunto) {
		Connection connection = ConnectionFactory.getConection();
		String sql = "insert into sistema.assunto(fk_curso,assunto) values(?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1,assunto.getCurso());
			ps.setString(2, assunto.getAssunto());
			System.out.println("Conectado com sucesso!");
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public List<Assunto> getAssuntos(){
		List<Assunto> assunto = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.assunto";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_assunto");
				int fk_curso = resultSet.getInt("fk_curso");
				String assunto2 = resultSet.getString("assunto");
				
				Assunto assuntoAux = new Assunto();
				assuntoAux.setId_assunto(id);
				assuntoAux.setCurso(fk_curso);
				assuntoAux.setAssunto(assunto2);
				assunto.add(assuntoAux);
				
			}
			for(Assunto a:assunto) {
				System.out.println(a);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return assunto;
	}	
	
	public String alterar(Assunto assunto) {
		Connection connection = ConnectionFactory.getConection();
		try {
		String sql = "update sistema.assunto set fk_curso="+assunto.getCurso()+", assunto="+"'"+assunto.getAssunto() +"'"+" where id_assunto="
		+assunto.getId_assunto();
		PreparedStatement ps = connection.prepareStatement(sql);
		System.out.println("Conectado com Sucesso!");
		//ps.executeQuery();
		ps.executeUpdate(sql);
		ps.close();
		connection.close();
		
		} catch( Exception e) {
			e.printStackTrace();
		}
		return assunto.getId_assunto()+assunto.getCurso()+assunto.getAssunto();
	}
	
	public int getExcluir(int id) {
		Connection connection = ConnectionFactory.getConection();
		

		try {
			
			String sql ="delete from sistema.assunto where id_assunto=?";
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
