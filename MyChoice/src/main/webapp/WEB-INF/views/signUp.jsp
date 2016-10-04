<%@include file="header.jsp" %>
<div>
<hr></hr>  
    <div align="center" class="form">
    <br></br>
    <br></br>
    <br></br>
    <br></br>
    <!-- action="<c:url value='j_spring_security_check'/>"-->
   
      <table>
      <form:form modelAttribute="user">
      <tr>
           <td style="font-size: 15px">User Name:<form:input path="name" />
           <form:errors path="name" style="color:Red"></form:errors></td> <td><br></br></td>
         </tr>
         <tr><td><br></br></td></tr>
         <tr>
           <td style="font-size: 15px">User Password:<form:password path="password" /><form:errors path="password" style="color:Red"></form:errors></td> <td><br></br></td>
         </tr>
          <tr><td><br></br></td></tr>
	<tr>
           <td style="font-size: 15px">Email-ID:<form:input path="emailid" /><form:errors path="emailid" style="color:Red"></form:errors></td> <td><br></br></td>
         </tr>
         <tr><td><br></br></td></tr>
         <tr><td></td>
            <td><input type="submit" name="_eventId_submit" value="SignUp" /></td>
         </tr>
         </form:form>
          
      </table>
 
 </div>
</div>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
<%@include file="footer.jsp" %>