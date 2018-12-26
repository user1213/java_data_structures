(function(){
	
	let module = (function(){
		return{
			init: (id, text) => {
				$(id).append(text);
			}
		}
	})();
	
	$(document).ready(function(){
		
		//module.init('#content', 'Loading....');
	});
	
})();