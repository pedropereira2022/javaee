/**
 * 
 */

 function confirmar(id){
	 let resposta = confirm(`Deseja confirmar o id ${id}?`)
	 if(resposta === true){
		 window.location.href = "delete?id=" + id;
	 }
	 else{
		 return false;
	 }
 }