<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 

<form action="modify">

 ID ：<input type="text" name="id" value="">
   NAME ：<input type="text" name="name" value="">
   <input type="submit" value="修改记录">
</form>
 
<form action="delete">
   
   ID ：<input type="text" name="id" value="">
   <input type="submit" value="删除记录">
   
   </form>
   
   <form action="query">
   
   ID ：<input type="text" name="id" value="">
   <input type="submit" value="定向查询">
   
   </form>
   
   <a href="show2" >查看全部 </a>
   
   