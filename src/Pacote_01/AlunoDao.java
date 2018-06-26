package Pacote_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDao {
	String cpf;
	String cpfAux;
	Integer id_aluno;
	String nome;
	
		public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		public Integer getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(Integer id_aluno) {
		this.id_aluno = id_aluno;
	}
		public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpfAux() {
		return cpfAux;
	}
	public void setCpfAux(String cpfAux) {
		this.cpfAux = cpfAux;
	}
		public List<Aluno> getAlunos(){
			List<Aluno> alunos = new ArrayList<>();
			try {
				Connection connection = ConnectionFactory.getConection();
				String sql = "select * from sistema.aluno";
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet resultSet = ps.executeQuery();
				
				while(resultSet.next()) {
					Integer id = resultSet.getInt("id_aluno");
					String nome = resultSet.getString("nome");
					String cpf = resultSet.getString("cpf");
					String data_nascimento = resultSet.getString("data_nascimento");
					int fk_curso1 = resultSet.getInt("fk_curso1");
					String email = resultSet.getString("email");
					int nota_curso1 = resultSet.getInt("nota_curso1");
					
					Aluno aluno = new Aluno();
					aluno.setId_aluno(id);
					aluno.setNome(nome);
					aluno.setCpf(cpf);
					aluno.setData_nascimento(data_nascimento);
					aluno.setCurso1(fk_curso1);
					aluno.setEmail(email);
					aluno.setNota_curso1(nota_curso1);
					alunos.add(aluno);
					
				}
				for(Aluno a:alunos) {
					System.out.println(a);
				}
				
			}catch (Exception e) {
				
				throw new IllegalArgumentException("Erro ao pegar a lista!");
				
			}
			return alunos;
		}
		public List<Aluno2> getAlunos2(){
			List<Aluno2> alunos = new ArrayList<>();
			try {
				Connection connection = ConnectionFactory.getConection();
				String sql = "select * from sistema.aluno where cpf="+cpf+";";
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet resultSet = ps.executeQuery();
				
				while(resultSet.next()) {
					Integer id = resultSet.getInt("id_aluno");
					String cpf = resultSet.getString("cpf");
					
					Aluno2 aluno = new Aluno2();
					aluno.setId_aluno(id);
					aluno.setCpf(cpf);
					cpfAux= cpf;
					alunos.add(aluno);
					
				}
				/*for(Aluno2 a:alunos) {
					System.out.println(a);
				}*/
				
			}catch (Exception e) {
				
				throw new IllegalArgumentException("Erro ao pegar a lista!");
				
			}
			return alunos;
		}
		public List<Aluno3> getAlunos3(){
			List<Aluno3> alunos = new ArrayList<>();
			try {
				Connection connection = ConnectionFactory.getConection();
				String sql = "select * from sistema.aluno where cpf="+cpf+";";
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet resultSet = ps.executeQuery();
				
				while(resultSet.next()) {
					Integer id = resultSet.getInt("id_aluno");
					
					Aluno3 aluno = new Aluno3();
					aluno.setId_aluno(id);
					id_aluno = id;
					alunos.add(aluno);
					
				}
				/*for(Aluno3 a:alunos) {
					System.out.println(a);
				}*/
				
			}catch (Exception e) {
				
				throw new IllegalArgumentException("Erro ao pegar a lista!");
				
			}
			return alunos;
		}
		
		public List<Aluno> getAlunos4(){//pesquisa de filtro matrícula
			List<Aluno> alunos = new ArrayList<>();
			try {
				Connection connection = ConnectionFactory.getConection();
				String sql = "select * from sistema.aluno where id_aluno=" + id_aluno+ ";";
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet resultSet = ps.executeQuery();
				
				while(resultSet.next()) {
					Integer id = resultSet.getInt("id_aluno");
					String nome = resultSet.getString("nome");
					String cpf = resultSet.getString("cpf");
					String data_nascimento = resultSet.getString("data_nascimento");
					int fk_curso1 = resultSet.getInt("fk_curso1");
					String email = resultSet.getString("email");
					int nota_curso1 = resultSet.getInt("nota_curso1");
					
					Aluno aluno = new Aluno();
					aluno.setId_aluno(id);
					aluno.setNome(nome);
					aluno.setCpf(cpf);
					aluno.setData_nascimento(data_nascimento);
					aluno.setCurso1(fk_curso1);
					aluno.setEmail(email);
					aluno.setNota_curso1(nota_curso1);
					alunos.add(aluno);
					
				}
				for(Aluno a:alunos) {
					System.out.println(a);
				}
				
			}catch (Exception e) {
				
				throw new IllegalArgumentException("Erro ao pegar a lista!");
				
			}
			return alunos;
		}
		public List<Aluno> getAlunos5(){//pesquisa de filtro nome
			List<Aluno> alunos = new ArrayList<>();
			try {
				Connection connection = ConnectionFactory.getConection();
				String sql = "select * from sistema.aluno where nome " +" like "+"'%"+ nome+"%'" +";";
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet resultSet = ps.executeQuery();
				
				while(resultSet.next()) {
					Integer id = resultSet.getInt("id_aluno");
					String nome = resultSet.getString("nome");
					String cpf = resultSet.getString("cpf");
					String data_nascimento = resultSet.getString("data_nascimento");
					int fk_curso1 = resultSet.getInt("fk_curso1");
					String email = resultSet.getString("email");
					int nota_curso1 = resultSet.getInt("nota_curso1");
					
					Aluno aluno = new Aluno();
					aluno.setId_aluno(id);
					aluno.setNome(nome);
					aluno.setCpf(cpf);
					aluno.setData_nascimento(data_nascimento);
					aluno.setCurso1(fk_curso1);
					aluno.setEmail(email);
					aluno.setNota_curso1(nota_curso1);
					alunos.add(aluno);
					
				}
				for(Aluno a:alunos) {
					System.out.println(a);
				}
				
			}catch (Exception e) {
				
				throw new IllegalArgumentException("Erro ao pegar a lista!");
				
			}
			return alunos;
		}
		public void salvar(Aluno aluno) {
		Connection connection = ConnectionFactory.getConection();
		String sql = "insert into sistema.aluno(nome,cpf,data_nascimento,fk_curso1,email) values(?,?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getCpf());
			ps.setString(3, aluno.getData_nascimento());
			ps.setInt(4, aluno.getCurso1());
			ps.setString(5, aluno.getEmail());
			System.out.println("Conectado com sucesso!");
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	public String alterar(Aluno aluno) {
		Connection connection = ConnectionFactory.getConection();
		try {
		String sql = "update sistema.aluno set nome="+"'"+aluno.getNome()+"'"+", cpf="+"'"+aluno.getCpf() +"'"+", data_nascimento="+"'"+aluno.getData_nascimento()+"'"
				+", fk_curso1="+aluno.getCurso1()+", email="+"'"+aluno.getEmail()+"'"+" where id_aluno="
				+aluno.getId_aluno();
		PreparedStatement ps = connection.prepareStatement(sql);
		System.out.println("Conectado com Sucesso!");
		//ps.executeQuery();
		ps.executeUpdate(sql);
		ps.close();
		connection.close();
		
		} catch( Exception e) {
			e.printStackTrace();
		}
		return aluno.getId_aluno()+aluno.getNome()+aluno.getCpf()+aluno.getData_nascimento()+aluno.getCurso1()+aluno.getEmail();
	}
	public String alterar2(int aluno, String cpf) {
		Connection connection = ConnectionFactory.getConection();
		try {
		String sql = "update sistema.aluno set nota_curso1="+"'"+aluno+"'"+" where cpf="
				+ cpf;
		PreparedStatement ps = connection.prepareStatement(sql);
		System.out.println("Conectado com Sucesso!");
		//ps.executeQuery();
		ps.executeUpdate(sql);
		ps.close();
		connection.close();
		
		} catch( Exception e) {
			e.printStackTrace();
		}
		return aluno+cpf;
	}
	public int getExcluir(int id) {
		Connection connection = ConnectionFactory.getConection();
		

		try {
			
			String sql ="delete from sistema.aluno where id_aluno=?";
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
