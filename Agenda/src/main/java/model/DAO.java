package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {
	// Módulo de conexão
	// Parâmetros para conexão

	/** The driver. */
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "backend@24";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	// Método de conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.print(e);
			return null;
		}
	}

	/**
	 * Inserir contato.
	 *
	 * @param contato the contato
	 */
	// CRUD -> CREATE
	public void inserirContato(JavaBeans contato) {
		String sql = "INSERT INTO contatos (nome,fone,email) VALUES(?,?,?)";
		try {
			// Abrir a conexão
			Connection con = conectar();
			// Preparar a query para execução no banco de dados
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Listar contatos.
	 *
	 * @return the array list
	 */
	// CRUD -> READ
	public ArrayList<JavaBeans> listarContatos() {
		// Criando um objeto para acessar a classe JavaBeans
		ArrayList<JavaBeans> lista = new ArrayList<JavaBeans>();
		// Atribuindo a Query para uma variável
		String sql = "SELECT * FROM contatos order by id";
		try {
			// Abrir a conexão
			Connection con = conectar();
			Statement pst = con.createStatement();
			ResultSet rs = pst.executeQuery(sql);
			while (rs.next()) {
				// Variáveis de apoio
				int id = Integer.parseInt(rs.getString("id"));
				String nome = rs.getString("nome");
				String fone = rs.getString("fone");
				String email = rs.getString("email");
				// Instanciando a classe JavaBeans
				JavaBeans Contato = new JavaBeans(id, nome, fone, email);
				// Populando o ArrayList
				lista.add(Contato);
			}
			con.close();
			return lista;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * Deletar contato.
	 *
	 * @param id the id
	 */
	// CRUD -> DELETE
	public void deletarContato(int id) {
		String sql = String.format("DELETE FROM contatos WHERE id = %d",id);
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
	        pst.executeUpdate(); // Executa a query de exclusão
	        pst.close();
	        con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * Selecionar contato.
	 *
	 * @param id the id
	 * @return the java beans
	 */
	// CRUD -> EDITAR
	public JavaBeans selecionarContato(int id) {
		String sql = String.format("SELECT * FROM contatos WHERE id = %d", id);
		try {
			Connection con = conectar();
			Statement pst = con.createStatement();
			ResultSet rs = pst.executeQuery(sql);
			String nome = null,fone = null,email = null;
			while (rs.next()) {
				// Variáveis de apoio
				nome = rs.getString("nome");
				fone = rs.getString("fone");
				email = rs.getString("email");
			}
			JavaBeans Contato = new JavaBeans(id, nome, fone, email);
			pst.close();
			con.close();
			return Contato;
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * Editar contato.
	 *
	 * @param contato the contato
	 */
	public void editarContato(JavaBeans contato) {
		String sql = "UPDATE contatos SET nome = ?, fone = ?, email = ? WHERE id = ?"	;
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, contato.getNome()); // Define o valor do ID no PreparedStatement
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.setInt(4, contato.getId());
			pst.executeUpdate(); // Executa a query de exclusão
			pst.close();
			con.close();
		} catch (Exception e) {
		}
	}

	// Teste de conexão
	// public void testeConexao() {
	// try{
	// Connection con = conectar();
	// System.out.println(con);
	// con.close();
	// } catch (Exception e) {
	// System.out.println(e);
	// }
	// }
}

