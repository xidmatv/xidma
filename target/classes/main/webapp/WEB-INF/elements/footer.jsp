<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="footer">
  <div class="row-fluid marketing">
    <div class="span12">
       <ul class="inline hidden-phone">
        <li><a href="/xidmatv/accueil?param0=mention">Mentions légale ||</a></li>
        <!--  <li><a href="#">Nos prestations ||</a></li>-->
        <li><a href="#">Nous contacter</a></li>
      </ul>
    </div>
      <p style="float:right">&copy; Touba taverny | Tous droits réservés <fmt:formatDate pattern="yyyy-MM-dd" 
            value="${now}" />.</p>
  </div>
</div>
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
   <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
   <script type="text/javascript"  src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
   <script type="text/javascript"> 
   	<%@ include file="/WEB-INF/webroot/js/datepickerFr.js" %> 
   	<%@ include file="/WEB-INF/webroot/js/tinymce/tinymce.min.js" %>
   </script> 
</body>
</html>