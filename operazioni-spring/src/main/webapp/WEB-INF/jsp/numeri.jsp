  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Scegli due numeri</h4>
<form action="risultato" method="post">
<input type="number" name="numeroUno" placeholder="Inserisci il primo numero"> <br>
<input type="number" name="numeroDue" placeholder="Inserisci il secondo numero"> <br>
		<input type="submit" value="Invio">
		<input type="hidden"  name="operazione" value= <c:out value = "${operazione}"/>>
</form>
</body>
</html>