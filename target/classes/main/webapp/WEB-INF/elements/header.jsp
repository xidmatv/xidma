 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <style type="text/css"> 
 	
 	<%@ include file="/WEB-INF/webroot/css/bootstrap.min.css" %>
 	<%@ include file="/WEB-INF/webroot/css/bootstrap-responsive.min.css" %>
 	<%@ include file="/WEB-INF/webroot/css/main.css" %>
 	<%@ include file="/WEB-INF/webroot/css/style.css" %>
 </style>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SaloumConseil</title>

</head>
<body>
<!--<%@page import="com.sun.org.apache.xml.internal.security.transforms.params.InclusiveNamespaces"%>-->
<div class="header navbar-fixed-top">
    <div style="background:none">
	    <div class="row-fluid">
		       <div class="span3">
		        	<h3><a href="/Job/index"><img src="/WEB-INF/webroot/img/ico/referral.png" alt=""></a></h3>
		      </div>
			<br>
			<div class="span6 navbar-inverse main-nav">
			    <ul class="nav nav-tabs hidden-phone" id="myTab">
			        <li><a href="/xidmatv/">Accueil</a></li>
			        <li><a href="src/main/webapp/views/ledahira.jsp">Le Dahira</a></li>
			        <li><a href="#">Le mouridisme</a></li>
			        <li><a href="#">Vidéos</a></li>
			        <li><a href="#">Photos</a></li>
			    </ul>
			    <div id="menu-smallscreen" class="visible-phone">
			        <select class="nav"> 
			            <option value="" selected="selected">Accueil</option> 
			            <option value="<?php echo $this->Html->url('/'); ?>">Accueil</option> 
			            <option value="#">Le Dahira</option>
			            <option value="#">Le mouridisme</option>
			            <option value="#">Vidéos</option>
			            <option value="#">Photo</option>
			        </select>
			    </div>
			</div>
		</div>
	 </div>
 </div>
  <br>