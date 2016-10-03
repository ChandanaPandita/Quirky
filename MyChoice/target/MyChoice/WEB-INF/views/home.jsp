
<%@include file="header.jsp" %>>
<br/><br/><br/><br/><br/>
<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      margin: auto;
  }
  </style>

</body>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
     
      
    </ol>

   
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src=<c:url value="/resources/images/dp.jpg"/>  width="100%" height="100%">
      </div>

      <div class="item">
        <img src=<c:url value="/resources/images/wp7.jpg"/> width="100%" height="100%">
      </div>

      
    </div>

    
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<br/>

<div class="container">
     <div class="row">
    <div class="col-md-6" id="addidas">
      <a href="MenBags.html">
        
        <img src=<c:url value="/resources/images/logo2.png"/>  class="img-rounded" alt="Adidas HandBags" style="width:200px;height:200px">
      </a>
   </div>
<br/>
    <div class="col-md-6" >
      <a href="WomenBags1.html">
        
        <img src=<c:url value="/resources/images/logo5.jpg"/>  class="img-rounded" alt="Caprese HandBags"  style="width:200px;height:200px">
     
     </a>
</div>
</div>
</div>
<%@include file="footer.jsp" %>