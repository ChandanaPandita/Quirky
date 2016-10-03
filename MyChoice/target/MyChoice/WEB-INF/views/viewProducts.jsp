<%@include file="adminHeader.jsp" %>
<br/><br/><br/>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  Search:${ss}
Item: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>Id</th>
    <th>Item Name</th>
    <th>Item Decsription</th>
    <th>Item Category</th>
    <th>Price</th>
    <th>Image</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
              <td bgcolor="pink">{{ resource.id}}</td>
            <td bgcolor="yellow">{{ resource.itemName}}</td>
            <td bgcolor="pink">{{ resource.description}}</td>
            <td bgcolor="yellow">{{ resource.category}}</td>
            <td bgcolor="pink">{{ resource.price}}</td>
            <td><img src="resources/images/{{resource.id}}.jpg" style="width:100px;height:100px;"/></td>
			<td><a href="deleteProducts?id={{resource.id}}">Delete</a></td> 
			<td><a href="editProducts?id={{resource.id}}">Edit</a></td>          
        </tr>    
    </table>
</div>
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