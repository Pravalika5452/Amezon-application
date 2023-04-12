
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<body bgcolor="pink">
<h1>Edit User Data</h1>
<form:form method="POST" action="/updateu">
<table>
<tr>
<td>Id</td>
<td><form:hidden path="cid"/></td>
</tr>
<tr>
<td>name</td>
<td><form:input path="cname"/></td>
</tr>
<tr>
<td>mobileno</td>
<td><form:input path="mobileno"/></td>
</tr>
<tr>
<td>pname</td>
<td><form:input  path="pname"/></td>
</tr>
<tr>
<td>price</td>
<td><form:input  path="price"/></td>
</tr>
<tr>
<td>qty</td>
<td><form:input  path="qty"/></td>
</tr>


<td><input type="submit" value="update"/></td><p></p>
</tr>
</table>
</form:form>
<a href="/result">View All Details<a><p></p>
<a href="/">Add new user here</a>
</body>


