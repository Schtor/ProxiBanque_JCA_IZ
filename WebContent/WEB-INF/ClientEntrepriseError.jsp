<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ClientEntrepriseError</title>
</head>
<body>
	<img src="../logo.png" />
	<center>
		<h4>Client "Nom"</h4>
		<p />
		<h4>Veuillez entrer les nouvelles informations</h4>
		<p />
	</center>
	<center>
		<form>
			Nom : <input type="text" id="Nom" name="Nom" placeholder="Nom">
			<p />
			N� SIRET : <input type="text" id="SIRET" name="SIRET"
				placeholder="SIRET">
			<p />
			Adresse : <input type="text" id="Adresse" name="Adresse"
				placeholder="Adresse">
			<p />
			Ville : <input type="text" id="Ville" name="Ville"
				placeholder="Ville">
			<p />
			T�l�phone : <input type="text" id="T�l�phone" name="T�l�phone"
				placeholder="T�l�phone">
			<p />
			Id : <input type="text" id="Id" name="Id" placeholder="Id">
			<p />
			<center>
				<font color="darkred">Champs invalides, veuillez r�essayer...</font>
				<p />
				<span class="bouton-valider"> <input type="submit"
					value="Valider">
				</span>
			</center>
		</form>
	</center>
</body>
</html>