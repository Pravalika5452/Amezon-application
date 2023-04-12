<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<table border="2" width="70%" cellpadding="2"> 

<tr>
    <th>cid</th>
    <th>cname</th>
    <th>mobileno</th>
    <th>pname</th>
     <th>price</th>
      <th>qty</th>
      <th>total</th>
      <th>discount</th>
      <th>invoicebill</th>
      <th>Delete</th>
      <th>Edit</th>
    </tr>
   <c:forEach var="cust" items="${Customer1}">   
   <tr>  
   <td>${cust.cid}</td>  
   <td>${cust.cname}</td> 
   <td>${cust.mobileno}</td>   
   <td>${cust.pname}</td>  
   <td>${cust.price}</td> 
   <td>${cust.qty}</td> 
   <td>${cust.total}</td>
   <td>${cust.discount}</td>
   <td>${cust.gstamt}</td>
   <td>${cust.invoicebill}</td>
   
   <td><a href="/delete/${cust.id}">Delete</a></td>
   <td><a href="/edit/${cust.id}">Edit</a></td>
 
    </tr>  
   </c:forEach>  
   </table>  
   <form:form/>
  
   
   </body>