package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
public class JavaBeans {
	
	/** The id. */
	//Atributos do servidor de bd dbagenda
	private int id;
	
	/** The email. */
	private String nome, fone, email;
	
	
	/**
	 * Instantiates a new java beans.
	 */
	// Construtor Superclasse
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new java beans.
	 *
	 * @param id the id
	 * @param nome the nome
	 * @param fone the fone
	 * @param email the email
	 */
	// Construtor com Campos
	public JavaBeans(int id, String nome, String fone, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Gets the fone.
	 *
	 * @return the fone
	 */
	public String getFone() {
		return fone;
	}
	
	/**
	 * Sets the fone.
	 *
	 * @param fone the new fone
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}

