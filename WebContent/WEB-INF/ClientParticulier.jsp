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
		<h4>Client "Nom" "Pr�nom"</h4>
		<p />
		<h4>Veuillez entrer les nouvelles informations</h4>
		<p />
	</center>
	<center>
		<form>
			Nom : <input type="text" id="Nom" name="Nom" placeholder="Nom">
			<p />
			Pr�nom : <input type="text" id="Pr�nom" name="Pr�nom"
				placeholder="Pr�nom">
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
				<p />
				<span class="bouton-valider"> <input type="submit"
					value="Valider">
				</span>
			</center>
		</form>
	</center>
</body>
</html>