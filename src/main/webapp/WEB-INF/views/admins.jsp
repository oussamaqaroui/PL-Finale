<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<head>
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style1.css">

</head>
<div class="errors">
  ${exception }
</div>



<div id="formAdmin" class="cadre">

 <f:form modelAttribute="admin" action="saveAdmin" method="post" enctype="multipart/form-data">
   <table>
     <tr>
       <td>ID </td>
       <td><f:input path="user_id"/></td>
       <td><f:errors path="user_id" cssClass="errors"></f:errors></td>
     </tr>
     <tr>
     <td>Username</td>
       <td><f:input path="user_name"/></td>
       <td><f:errors path="user_name" cssClass="errors"></f:errors></td>
     </tr>
     <tr>
     <td>password</td>
       <td><f:input path="password"/></td>
       <td><f:errors path="password" cssClass="errors"></f:errors></td>
     </tr>
      <tr>
     <td>Nom</td>
       <td><f:input path="nom"/></td>
       <td><f:errors path="nom" cssClass="errors"></f:errors></td>
     </tr>
     <tr>
      <tr>
     <td>Prenom</td>
       <td><f:input path="prenom"/></td>
       <td><f:errors path="prenom" cssClass="errors"></f:errors></td>
     </tr>
     <tr>
     <td>Email</td>
       <td><f:input path="email"/></td>
       <td><f:errors path="email" cssClass="errors"></f:errors></td>
     </tr>
     <tr>
     <td>Adresse</td>
       <td><f:textarea path="adresse"/></td>
       <td><f:errors path="adresse" cssClass="errors"></f:errors></td>
     </tr>  
     <tr>
      <td>Photo</td>
       <td>
       <c:if test="${user.user_id!=null}">
         <img alt="" src="photoAdmin?user_id=${user.user_id}">
       </c:if>
       </td>
       <td>
       
       <input type="file" name="file"/>
       </td>  
     </tr>
     <tr> 
     <td>Date naissance</td>
       <td><f:input path="dateNaissance" type="date" /></td>
       <td><f:errors path="dateNaissance" cssClass="errors"></f:errors></td>
     </tr>
       <tr>
     <td>Activé</td>
       <td><f:checkbox path="actived" value="true"/></td>
       <td><f:errors path="actived" cssClass="errors"></f:errors></td>
     </tr>   
      <tr>
       <td><input type="submit" value="Save" name="save"/></td>
       <td><input type="submit" value="Find" name="find"/></td>
       <td><input type="submit" value="Get All Admins" name="getAll"/></td>
      </tr>
   </table>
 </f:form>
</div>
<div id="tabAdmins" class="cadre">
	<table class="tab1">
		<tr>
		  <th>ID</th><th>USERNAME</th><th>NOM</th><th>PRENOM</th><th>EMAIL</th>
		  <th>ADRESSE</th><th>DATE NAISSANCE</th><th>PHOTO</th><th>ACTIVED</th>
		</tr>
	<c:forEach items="${users}" var="p">
	    <tr>
	       <td>${p.user_id}</td>
	       <td>${p.user_name}</td>
	       <td>${p.nom}</td>
	       <td>${p.prenom}</td>
	       <td>${p.email}</td>
	       <td>${p.adresse}</td>
	       <td>${p.dateNaissance}</td>
	       <td><img alt=""src="photoAdmin?userID=${p.user_id}"></td>
	       <td>${p.actived}</td>
	       <td><a href="suppAdmin?userID=${p.user_id}">Supprimer</a></td>
	       <td><a href="editAdmin?userID=${p.user_id}">Editer</a></td>
	         
	    </tr>
	</c:forEach>
	</table>
</div>