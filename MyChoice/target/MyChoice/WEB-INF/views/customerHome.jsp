<%@include file="customerHeader.jsp" %>
<br></br>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
Search Item: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>Item Name</th>
    <th>Price</th>
    <th>Image</th>
    <th>Info</th>

    </tr>
        <tr ng-repeat="resource in names | filter:search">
            <td bgcolor="pink">{{resource.itemName}}</td>
            <td bgcolor="yellow">{{resource.price}}</td>
            <td><img src="resources/images/{{resource.id}}.jpg" style="width:100px;height:100px"></td>
             <td><a href="productOverview?id={{resource.id}}">View Product Description</a></td>
                        
        </tr>    
    </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listofproducts};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
<%@include file="footer.jsp" %>