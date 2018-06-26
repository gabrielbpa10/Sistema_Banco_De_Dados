package Pacote_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilitadorDao {

	Integer matricula;
	String nome;
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Facilitador> getFacilitadores(){
		List<Facilitador> facilitador = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.facilitador";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_facilitador");
				String nome = resultSet.getString("nome");
				String cpf = resultSet.getString("cpf");
				double salario = resultSet.getDouble("salario");
				int fk_curso = resultSet.getInt("fk_curso");
				String email = resultSet.getString("email");
				
				Facilitador facilitador2 = new Facilitador();
				facilitador2.setId_facilitador(id);
				facilitador2.setNome(nome);
				facilitador2.setCpf(cpf);
				facilitador2.setSalario(salario);
				facilitador2.setFk_curso(fk_curso);
				facilitador2.setEmail(email);
				facilitador.add(facilitador2);
				
			}
			for(Facilitador f:facilitador) {
				System.out.println(f);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return facilitador;
	}
	
	public List<Facilitador> getFacilitadores2(){
		List<Facilitador> facilitador = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.facilitador where id_facilitador="+matricula+";";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_facilitador");
				String nome = resultSet.getString("nome");
				String cpf = resultSet.getString("cpf");
				double salario = resultSet.getDouble("salario");
				int fk_curso = resultSet.getInt("fk_curso");
				String email = resultSet.getString("email");
				
				Facilitador facilitador2 = new Facilitador();
				facilitador2.setId_facilitador(id);
				facilitador2.setNome(nome);
				facilitador2.setCpf(cpf);
				facilitador2.setSalario(salario);
				facilitador2.setFk_curso(fk_curso);
				facilitador2.setEmail(email);
				facilitador.add(facilitador2);
				
			}
			for(Facilitador f:facilitador) {
				System.out.println(f);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return facilitador;
	}
	public List<Facilitador> getFacilitadores3(){
		List<Facilitador> facilitador = new ArrayList<>();
		try {
			Connection connection = ConnectionFactory.getConection();
			String sql = "select * from sistema.facilitador where nome like"+"'%"+nome+"%'"+";";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				Integer id = resultSet.getInt("id_facilitador");
				String nome = resultSet.getString("nome");
				String cpf = resultSet.getString("cpf");
				double salario = resultSet.getDouble("salario");
				int fk_curso = resultSet.getInt("fk_curso");
				String email = resultSet.getString("email");
				
				Facilitador facilitador2 = new Facilitador();
				facilitador2.setId_facilitador(id);
				facilitador2.setNome(nome);
				facilitador2.setCpf(cpf);
				facilitador2.setSalario(salario);
				facilitador2.setFk_curso(fk_curso);
				facilitador2.setEmail(email);
				facilitador.add(facilitador2);
				
			}
			for(Facilitador f:facilitador) {
				System.out.println(f);
			}
			
		}catch (Exception e) {
			
			throw new IllegalArgumentException("Erro ao pegar a lista!");
			
		}
		return facilitador;
	}
	
	public void salvar(Facilitador facilitador) {
		Connection connection = ConnectionFactory.getConection();
		String sql = "insert into sistema.facilitador(nome,cpf,salario,fk_curso,email) values(?,?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, facilitador.getNome());
			ps.setString(2, facilitador.getCpf());
			ps.setDouble(3, facilitador.getSalario());
			ps.setInt(4, facilitador.getFk_curso());
			ps.setString(5, facilitador.getEmail());
			System.out.println("Conectado com sucesso!");
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String alterar(Facilitador facilitador) {
		Connection connection = ConnectionFactory.getConection();
		try {
		String sql = "update sistema.facilitador set nome="+"'"+facilitador.getNome()+"'"+", cpf="+"'"+facilitador.getCpf() +"'"+", salario="+facilitador.getSalario()
				+", fk_curso="+facilitador.getFk_curso()+", email="+"'"+facilitador.getEmail()+"'"+" where id_facilitador="
				+facilitador.getId_facilitador();
		PreparedStatement ps = connection.prepareStatement(sql);
		System.out.println("Conectado com Sucesso!");
		//ps.executeQuery();
		ps.executeUpdate(sql);
		ps.close();
		connection.close();
		
		} catch( Exception e) {
			e.printStackTrace();
		}
		return facilitador.getId_facilitador()+facilitador.getNome()+facilitador.getCpf()+facilitador.getSalario()+facilitador.getFk_curso()+facilitador.getEmail();
	}
	public int getExcluir(int id) {
	
		Connection connection = ConnectionFactory.getConection();
		

		try {
			
			String sql ="delete from sistema.facilitador where id_facilitador=?";
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
