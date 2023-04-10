<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<div class="row-fluid">
	<div class="search-area" style="">
		<form action="<?php echo Router::url(array('plugin' => false, 'controller' => 'entreprises', 'action' => 'rechercher')); ?>" class="custom show-search-options position-left form-inline span10 offset1 recherform" id="formSearchEntreprises">
	        <div class="input-wrapper span6">
	          <input type="text" class="input-large input-contrast" autocomplete="off" id="formSearchEntreprisesWhat" name="what" placeholder="Qui, quoi&nbsp;?">
	          <div class="error-message"></div>
	          <p id="enter_location_error_message" class="bad" style="display:none;">
	            Quel métier recherchez-vous ?
	          </p>
	        </div>
	        <div class="input-wrapper span6">
	          <input type="text" class="input-large input-contrast" autocomplete="off" id="formSearchEntreprisesWhere" name="where" placeholder="Où&nbsp;?">
	          <p id="enter_location_error_message" class="bad" style="display:none;">
	            Dans quelle ville ou département ?
	          </p>
	        </div>
	        
	        <button type="submit" class="btn btn_home span2" id="submit_location">
	          Rechercher
	        </button>
		</form>
	</div>
</div>
<script>

$(function(){

	//autocomplete de champs qui quoi
	//on cherche la liste des catégories qui commencent par ce mot(avec ajax)
	$('input#formSearchEntreprisesWhat').autocomplete({
		source: function( request, response ) {
			var $name = request.term;
			$url = '/entreprises/recherchecategoryname/'+ $name; 
			$.ajax({
				type: 'get' ,
				url: $url,
				dataType: "json",
				success: function( data ) {
		          	//la liste de suggestion contient les items de data retourné par la requete ajax
		            response($.map(data, function(item){
              			return {
              				label: item, //l'item  qui sera affiché dans la liste
    						value: item  //la valeur renvoyé si on choisi cet item
    					}
		          	}))
	           	}
	        })
		}
	});

	//autocomplete de champs ou
	//on cherche la liste des codes postals des entreprises en ligne qui commencent par le numéro tapé
	$('input#formSearchEntreprisesWhere').autocomplete({
		source: function( request, response ) {
			var $code = request.term;
			$url = '/entreprises/listcodepostalsvilles/'+ $code; 
			$.ajax({
				type: 'get' ,
				url: $url,
				dataType: "json",
				success: function( data ) {
					//la liste de suggestion contient les items de data retourné par la requete ajax
					response( $.map(data, function(item){
						return {
							label: item, //l'item  qui sera affiché dans la liste
							value: item  //la valeur renvoyé si on choisi cet item
						}

					}))
				}
			})
		}
	});
});
</script>
