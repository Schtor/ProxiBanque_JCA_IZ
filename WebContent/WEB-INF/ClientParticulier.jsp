<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ClientParticulier</title>
</head>
<body>
	<img src="../logo.png" />
	<center>
		<h4>Client "Nom" "Prénom"</h4>
		<p />
		<h4>Veuillez entrer les nouvelles informations</h4>
		<p />
	</center>
	<center>
		<form>
			Nom : <input type="text" id="Nom" name="Nom" placeholder="Nom">
			<p />
			Prénom : <input type="text" id="Prénom" name="Prénom"
				placeholder="Prénom">
			<p />
			Adresse : <input type="text" id="Adresse" name="Adresse"
				placeholder="Adresse">
			<p />
			Ville : <input type="text" id="Ville" name="Ville"
				placeholder="Ville">
			<p />
			Téléphone : <input type="text" id="Téléphone" name="Téléphone"
				placeholder="Téléphone">
			<p />
			Id : <input type="text" id="Id" name="Id" placeholder="Id">
			<p />
			<center>
				<p />
				<span class="bouton-valider"> <input type="submit"
					value="Valider">
				</span>
			</center>
		</form>
	</center>
</body>
</html>