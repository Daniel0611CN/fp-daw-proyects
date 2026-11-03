<%--
  Created by IntelliJ IDEA.
  User: danic
  Date: 15/11/2024
  Time: 21:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ejercicio 9</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/ej9/ej9.css">
</head>
<body>
    <h1><%= "Ejercicio 9" %></h1>
    <br/>
    <h3><%= "Crea una aplicación que dibuje un tablero de ajedrez mediante una tabla HTML generada con bucles usando JSP,<br>" +
            "y que sitúe dentro del tablero un alfil y un caballo en posiciones aleatorias. Las dos figuras no pueden estar<br>" +
            "colocadas en la misma casilla. Las filas y las columnas del tablero deben estar etiquetadas correctamente." %></h3>
    <a href="../index.jsp">Lista Ejercicios</a>

    <!--Comienzo Ejercicio 9-->

    <%
        int filaRandom = (int) (Math.random()*8)+1;
        int columnaRandom = (int) (Math.random()*8)+1;

        int filaRandom2 = (int) (Math.random()*8)+1;
        int columnaRandom2 = (int) (Math.random()*8)+1;

        while (filaRandom == filaRandom2) {
            filaRandom2 = (int) (Math.random()*8)+1;
        }

        while (columnaRandom == columnaRandom2) {
            columnaRandom2 = (int) (Math.random()*8)+1;
        }

        String caballo = "♘";
        String alfil = "♗";
    %>
    <div>
    <table border="1" style="border: 1px solid black;">
        <thead>
        <tr>
            <th> </th>
            <%
                String letras = "ABCDEFGH";
                for (int i = 0; i < letras.length(); i++) {
            %>
            <th>
                <%= letras.charAt(i) %>
            </th>
            <%  } %>
        </tr>
        </thead>

        <tbody>
        <tr>
            <%
                for (int i = 1; i < 9; i++) {
            %>
            <tr>
                <th>
                    <%= i %>
                </th>
                <%
                    for (int j = 0; j < 9; j++) {

                        if (i == filaRandom && j == columnaRandom-1) {
                %>
                            <td>
                                <%= caballo %>
                            </td>

                        <% } else if (i == filaRandom2 && j == columnaRandom2-1) { %>

                            <td>
                                <%= alfil %>
                            </td>

                        <% } else if (j < 8) { %>

                            <td>
                                <%= " " %>
                            </td>

                        <%  } %>

            <% } %>
            </tr>

            <% } %>

        </tr>
        </tbody>
    </table>
    </div>


</body>
</html>
