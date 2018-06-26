package Pacote_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagamentoDao {

	int fk_aluno;
	
	public int getFk_aluno() {
		return fk_aluno;
	}

	public void setFk_aluno(int fk_aluno) {
		this.fk_aluno = fk_aluno;
	}

	public void salvar(Pagamento pagamento) {
		Connection connection = ConnectionFactory.getConection();
		String sql = "insert into sistema.pagamento(vista,parcelado,fk_aluno) values(?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setBoolean(1, pagamento.isVista());//Verificar se conecta dessa forma.
			ps.setBoolean(2, pagamento.isParcelado());
			ps.setInt(3, pagamento.getFk_aluno());
			System.out.println("Conectado com sucesso!");
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String alterar(Pagamento pagamento) {
		Connection connection = ConnectionFactory.getConection();
		try {
		String sql = "update sistema.pagamento set data_termino="+pagamento.getData_termino()+", vista="+pagamento.isVista() +", parcelado="+pagamento.isParcelado()
				+", fk_aluno="+pagamento.getFk_aluno()+" where fk_aluno="
				+fk_aluno;
		PreparedStatement ps = connection.prepareStatement(sql);
		System.out.println("Conectado com Sucesso!");
		
		ps.executeUpdate(sql);
		ps.close();
		connection.close();
		
		} catch( Exception e) {
			e.printStackTrace();
		}
		return pagamento.getData_termino()+pagamento.isVista()+pagamento.isParcelado()+pagamento.getFk_aluno();
	}
	
}
