<%--
  Created by IntelliJ IDEA.
  User: yuyu
  Date: 2016/10/19
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
</head>
<body>

<h1>使用流上传</h1>
<form method="post" action="multipart1" enctype="multipart/form-data">
    <input type="text" name="name"/>
    <input type="file" name="file"/>
    <input type="submit"/>
</form>

<h1>使用file.Transto上传</h1>
<form method="post" action="multipart1" enctype="multipart/form-data">
    <input type="text" name="name"/>
    <input type="file" name="file"/>
    <input type="submit"/>
</form>

<h1>使用流上传</h1>
<form method="post" action="multipart1" enctype="multipart/form-data">
    <input type="text" name="name"/>
    <input type="file" name="file"/>
    <input type="submit"/>
</form>


<div>

    Spring内置的multipart（多部件）支持，可以在web应用中处理文件的上传。你能够启用MultipartResolver(多部件解析器)对象来开启对多部件的支持功能。这个对象是在org.springframework.web.multipart包里定义的。Spring提供了基于Commons
    FileUpload的MultipartResolver的实现，也提供了基于Servlet3.0 多部件请求解析的MultipartResolver的实现。
    默认情况下，Spring是不会去处理多部件的，因为有些开发者想要自行处理它们。你可以在web应用中的context里，添加一个multipartresolver(多部件解析器)来启用Spring的多部件处理。每一个请求会被检测是否带有一个多部件。如果没有，那么请求照常处理，如果有多部件，在context中声明的MultipartResolver就会被使用。然后，在请求中的多部件就会被其处理。
</div>
<div>当然，你也需要在你的classpath下面放入对应的jar包，这样多部件解析器才能正常运行。在使用CommonsMultipartResolver时，你需要使用commons-fileupload.jar包。
    当Spring的DispatcherServlet检测到一个含有多部件的请求时，它会启用已经在context中声明了的解析器来处理这个请求。然后，这个解析器将会把现有HttpServletRequest封装成一个MultipartHttpServletRequest，以支持多部件文件上传。你能够获取到这个请求中所包含多部件的信息，也能在controller中访问到这个多部件文件。
</div>


</body>
</html>
