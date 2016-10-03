<%@include file="adminHeader.jsp" %>
    
    <table align="center">
 <form:form action="addProducts" commandName="item" enctype="multipart/form-data">
  <tr>
     <td> Item Name</td>
      <td><form:input path="itemName"></form:input></td>
<td><form:errors path="itemName" style="color:red"></form:errors></td>
   </tr><br/>
        
        <tr> 
      <td>Item Desrciption</td>
      <td><form:input path="description"></form:input></td>
<td><form:errors path="itemName" style="color:red"></form:errors></td>
</tr>
      <br/>
      <tr>
      <td>Item Price</td>
      <td><form:input path="price"></form:input></td>
<td>
<form:errors path="price" style="color:red"></form:errors></td>
</tr><br/>
        <tr>
        <td>
Category</td>
<td><form:select path="category">
<form:option value="Baggit"></form:option>
<form:option value="Caprese"></form:option>
<form:option value="Puma"></form:option>
<form:option value="Addidas"></form:option>
</form:select></td></tr>
<br/>
<tr>
   <td>Item Image:</td>
   <td><input type="file" value="file" name="file"/></td>
</tr>
<br/>
<tr>
  <td> <input type="submit" value="Add Products" /></td>
  </tr>
         
     
  </form:form>

 
</table>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
     
<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${item};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
<%@include file="footer.jsp" %>