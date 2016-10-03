<%@include file="adminHeader.jsp" %>
<br/><br/><br/><br/>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  Data:${ss}
<p align="right">Search: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>Id</th>
    <th>UserName</th>
    <th>Email</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td bgcolor="pink">{{resource.id}}</td>
           	<td bgcolor="blue">{{ resource.name}}</td>
            <td bgcolor="pink">{{ resource.emailid}}</td>
           
        </tr>    
    </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listofcustomers};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
<br/><br/><br/><br/>
<br/><br/><br/><br/>
<br/><br/><br/><br/>
<br/><br/><br/><br/>
<%@include file="footer.jsp" %>