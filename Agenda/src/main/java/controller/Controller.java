package controller;

import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
@WebServlet(urlPatterns = { "/Controller", "/main", "/lista-contatos", "/insert", "/select", "/delete", "/editar",
		"/download" })
public class Controller extends HttpServlet {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The dao. */
	DAO dao = new DAO();
	
	/** The contato. */
	JavaBeans contato = new JavaBeans();

	/**
	 * Instantiates a new controller.
	 */
	public Controller() {
		super();
	}

	/**
	 * Do get.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Teste de conexão
		// dao.testeConexao();

		String requisicao = request.getServletPath();
		System.out.println(requisicao);

		if (requisicao.equals("/main")) {
			contatos(request, response);
		} else if (requisicao.equals("/insert")) {
			novoContato(request, response);
		} else if (requisicao.equals("/lista-contatos")) {
			listaContatos(request, response);
		} else if (requisicao.equals("/select")) {
			selecionarContato(request, response);
		} else if (requisicao.equals("/delete")) {
			deletarContato(request, response);
		} else if (requisicao.equals("/editar")) {
			editarContato(request, response);
		} else if (requisicao.equals("/download")) {
			downloadListaContatos(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	/**
	 * Contatos.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("agenda.jsp");
	}

	/**
	 * Novo contato.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	// Novo Contato
	protected void novoContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// teste de recebimento de dados do formulário novo.html
		// System.out.println(request.getParameter("nome"));
		// System.out.println(request.getParameter("fone"));
		// System.out.println(request.getParameter("email"));

		// Setar os Atributos do JavaBenas
		contato.setNome(request.getParameter("nome"));
		contato.setFone(request.getParameter("fone"));
		contato.setEmail(request.getParameter("email"));
		// Invocar o metodo inserir contato passando o objeto contato
		dao.inserirContato(contato);
		// Redirecionamento
		response.sendRedirect("agenda.jsp");
	}

	/**
	 * Lista contatos.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void listaContatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.sendRedirect("listacontatos.jsp");
		// Criando um objeto que irá receber os dados da Classe JavaBeans
		ArrayList<JavaBeans> lista = dao.listarContatos();
		request.setAttribute("contatos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/listacontatos.jsp");
		rd.forward(request, response);
	}

	/**
	 * Deletar contato.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void deletarContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		dao.deletarContato(id);
		listaContatos(request, response);

	}

	/**
	 * Selecionar contato.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void selecionarContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		JavaBeans contato = dao.selecionarContato(id);
		request.setAttribute("id", contato.getId());
		request.setAttribute("nome", contato.getNome());
		request.setAttribute("fone", contato.getFone());
		request.setAttribute("email", contato.getEmail());
		RequestDispatcher rd = request.getRequestDispatcher("/editar.jsp");
		rd.forward(request, response);
	}

	/**
	 * Editar contato.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void editarContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String fone = request.getParameter("fone");
		String email = request.getParameter("email");
		dao.editarContato(new JavaBeans(id, nome, fone, email));
		listaContatos(request, response);

	}

	/**
	 * Download lista contatos.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void downloadListaContatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Document pdf = new Document();
		try {
			// tipo de conteúdo
			response.setContentType("application/pdf");
			// nome do documento
			response.addHeader("Content-Disposition", "inline; filename =" + "contatos.pdf");
			// criar o documento
			PdfWriter.getInstance(pdf, response.getOutputStream());
			// abrir o documento - > conteúdo
			pdf.open();
			pdf.add(new Paragraph("Lista de contatos: "));
			pdf.add(new Paragraph(" "));
			// criar uma tabela ( 3 = numero de colunas )
			PdfPTable tabela = new PdfPTable(3);
			// Criando as variaveis da coluna e adicionando na tabela
			PdfPCell nome = new PdfPCell(new Paragraph("Nome"));
			PdfPCell fone = new PdfPCell(new Paragraph("Fone"));
			PdfPCell email = new PdfPCell(new Paragraph("E-mail"));
			tabela.addCell(nome);
			tabela.addCell(fone);
			tabela.addCell(email);

			// popular a tabela com os contatos
			ArrayList<JavaBeans> lista = dao.listarContatos();
			for (int i = 0; i < lista.size(); i++) {
				tabela.addCell(lista.get(i).getNome());
				tabela.addCell(lista.get(i).getFone());
				tabela.addCell(lista.get(i).getEmail());
			}
			// adicionando a tabela no documento
			pdf.add(tabela);
			pdf.close();
		} catch (Exception e) {
			pdf.close();
		}

	}
}

