<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ClientVirement</title>
</head>
<body>
	<img src="../logo.png" />
	<p />
	<center>
		<h4>Client "Nom" souhaite r�aliser un virement � :</h4>
		<p />
		Choix du client : <select name="Client">
			<option selected value=""></option>
			<option value="Client">Liste Client</option>
		</select>
		<p />
		<h4>S�lectionner le compte � d�biter :</h4>
		<p />
		Choix du compte : <select name="Compte">
			<option selected value=""></option>
			<option value="Compte">Liste comptes du client</option>
		</select>
		<p />
		<h4>S�lectionner le compte � cr�diter :</h4>
		<p />
		Choix du compte : <select name="Compte">
			<option selected value=""></option>
			<option value="Compte">Liste comptes du client</option>
		</select>
		<p />
		Veuillez saisir le montant du virement : <input type="text" id="Nom"
			name="Nom" placeholder="Nom">
	</center>
	<p />
	<center>
		<span class="bouton-valider"> <input type="submit"
			value="Valider">
		</span> <span class="bouton-retour"> <input type="submit"
			value="Retour">
		</span>
	</center>
</body>
</html>