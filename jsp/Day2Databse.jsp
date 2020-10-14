<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>SELECT Operation</title>
   </head>

   <body>
      <sql:setDataSource var = "snapshot" driver = "org.postgresql.Driver"
         url = "jdbc:postgresql://localhost:5432/Training"
         user = "postgres"  password = "tiger"/>
 
      <sql:query dataSource="${snapshot}" var = "result">
         SELECT * FROM public.users;
      </sql:query>
 
      <table border = "1">
         <tr>
            <th>username</th>
            <th>password</th>
            <th>email</th>
            <th>mobileno</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.id}"/></td>
               <td><c:out value = "${row.first}"/></td>
               <td><c:out value = "${row.last}"/></td>
               <td><c:out value = "${row.age}"/></td>
            </tr>
         </c:forEach>
      </table>
 
   </body>
</html>