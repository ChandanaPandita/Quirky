<%@include file="customerHeader.jsp" %>
<br/><br/><br/>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  
<a href="viewCart">View Cart</a>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>Id</th>
    <th>Item Name
    <th>Description</th>
    
    </tr>
        <tr ng-repeat="resource in names | filter:search">
              <td>${item.id}</td>
              <td>${item.itemName}</td>
           	<td>${item.description}</td>
            <td><img src="resources/images/${item.id}.jpg" style="width:100px;height:100px;"/></td>
			<td><a href="addingtoCart?id=${item.id}">Add to Cart</a></td> 
			        
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
<br/><br/><br/><br/><br/><br/><br/><br/><br/>
<br/><br/><br/><br/><br/><br/>
<%@include file="footer.jsp" %>