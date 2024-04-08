/**
 * Validação de formulário
 * @author Pedro Pereira
 * 
 */
function validarEditar(event){
	event.preventDefault();
	const nome = frmEditarContato.nome.value;
	const fone = frmEditarContato.fone.value;
	if(nome === ""){
		alert('Preencha o campo nome!');
		frmContato.nome.focus();
		return false;
	} else if (fone === ""){
		alert("Preencha o campo telefone!");
		frmContato.fone.focus();
		return false;
	} else {		
		document.forms["frmEditarContato"].submit();
	}
}