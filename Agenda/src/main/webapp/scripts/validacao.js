/**
 * Validação de formulário
 * @author Pedro Pereira
 * 
 */
function validar(event){
	event.preventDefault();
	const nome = frmContato.nome.value;
	const fone = frmContato.fone.value;
	if(nome === ""){
		alert('Preencha o campo nome!');
		frmContato.nome.focus();
		return false;
	} else if (fone === ""){
		alert("Preencha o campo telefone!");
		frmContato.fone.focus();
		return false;
	} else {		
		document.forms["frmContato"].submit();
	}
}