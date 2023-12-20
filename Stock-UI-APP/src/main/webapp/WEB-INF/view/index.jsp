<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
   <h2> Get Stock Price</h2>
   
   ${msg  }
   
   <form method="get" action="getTotalCost">
      <table>
         <tr>
         	<td>Company Name</td>
         	<td>
         	  <input type= 'text' name='companyName' />
         	</td>
         </tr>
         
         <tr>
         	<td>Quantity</td>
         	<td>
         	  <input type= 'text' name='quantity' />
         	</td>
         </tr>
         
         <tr>
         	<td></td>
         	<td>
         	  <input type= 'submit' value='Get Cost' />
         	</td>
         </tr>
         
      </table>
   
   </form>
</body>
</html>