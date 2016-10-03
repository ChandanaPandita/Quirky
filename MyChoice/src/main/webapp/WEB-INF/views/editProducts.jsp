<%@include file="adminHeader.jsp" %>
<div>
<div class="container">
</div>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>Id</th>
    <th>ItemName</th>
    <th>ItemDecsription</th>
    <th>Item Category</th>
    <th>Price</th>
    <th>Image</th>
    </tr>
    <tr>
        <form action="updateProducts" method="post">
              <td bgcolor="pink"><input type="hidden" value="${item.id}" name="id"/></td>
            <td bgcolor="yellow"><input value="${item.itemName}" name="itemName"/></td>
            <td bgcolor="pink"><input value="${item.description}" name="description"/></td>
            <td bgcolor="yellow"><input value="${item.category}" name="category"/></td>
            <td bgcolor="pink"><input value="${item.price}" name="price"/></td>
            <td><img src="resources/images/${item.id}.jpg" style="width:100px;height:100px;"/></td>
			<td><input type="submit" value="update"></td> 
		</form>	          
        </tr>    
    </table>
</div>
<br/><br/><br/><br/><br/>
<%@include file="footer.jsp"%>