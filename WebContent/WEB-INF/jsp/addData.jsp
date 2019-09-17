<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<form action="addData">

	产品名称 ：<input type="text" name="name" value=""><br />

	<input type="submit" value="增加商品">
</form>
<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>成功添加</td>
        <td>${count} </td>
        <td>条记录</td>
    </tr>
   </table>
   <a href="show" >查看结果 </a>