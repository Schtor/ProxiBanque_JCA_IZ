<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PortalError</title>
</head>
<body>
	<img src="../logo.png" />
	<p />
	<center>
		<h3>Bienvenue, "Nom" "Prénom".</h3>
	</center>
	<p />
	<center>
		<p />
		<table>
			<tr>
				<td><h4>
						<center>Id Client</center>
					</h4></td>
				<td><h4>
						<center>Statut</center>
					</h4></td>
				<td><h4>
						<center>Nom</center>
					</h4></td>
				<td><h4>
						<center>Ville</center>
					</h4></td>
				<td><h4>
						<center>Téléphone</center>
					</h4></td>
			</tr>
			<tr>
				<td><h5>
						<center>"Liste Id"</center>
					</h5></td>
				<td><h5>
						<center>"Liste statut"</center>
					</h5></td>
				</h5>
				<td><h5>
						<center>"Liste nom"</center>
					</h5></td>
				</h5>
				<td><h5>
						<center>"Liste ville"</center>
					</h5></td>
				</h5>
				<td><h5>
						<center>"Liste téléphone"</center>
					</h5></td>
			</tr>
		</table>
		<p />
	</center>
	<center>
		<p />
		Id du client : <input type="text" id="Id" name="Id"
			placeholder="Saisissez l'id du client">
		<p />
		<font color="darkred">Mauvais id, veuillez entrer un Id
			existant.</font>
		<p />
		<span class="bouton-éditer"> <input type="submit"
			value="Editer">
		</span> <span class="bouton-consulter"> <input type="submit"
			value="Consulter Comptes">
		</span> <span class="bouton-virement"> <input type="submit"
			value="Virement">
		</span>
	</center>
</body>
</html>