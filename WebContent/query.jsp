<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>query</title>
<script type="text/javascript"></script>
<script src="js/jquery-2.2.1.min.js"></script>
<script>
    
   function queryById(){
	    var dataid=document.getElementById("dataid").value;
	    alert("编号为"+dataid+"的详细信息如下：");
	    window.location.href="cw_queryById.action?dataid="+dataid;
   };
   
   function delet(){
	  
	    var dataid=document.getElementById("dataid").value;
	    window.location.href="cw_delete.action?dataid="+dataid;
	   
	    if(confirm('你确定要删除编号为'+dataid+'的员工吗？'))
	    {
	        return true;
	    }else{
	        return false;
	    	
	    }
	     
  };
  
   function motify(){
	   
	    var dataid=document.getElementById("dataid").value;
	    alert(dataid);
	    window.location.href="cw_queryByid.action?dataid="+dataid;
	    if(confirm('你确定要修改编号为'+dataid+'的员工吗？'))
	    {
	        return true;
	    }else{
	        return false;
	    }
 } 
     
  
</script>
</head>
<body>
      <table border="1">
      	<tr>
      	                <td>编号</td>
      	          	    <td>主题</td>
      	          	    <td>类型</td>
      	          	    <td>内容</td>
      	          	    <td>时间</td>
      	          	    <td>操作</td>
      	          	    <td>操作</td>
      	          	    <td>操作</td>
      	    
      	</tr>
      <s:iterator value="list">
       <tr>
      	 <td><s:property value="dataid"/></td>
      	 <td><s:property value="datatitle"/></td>
      	 <td><s:property value="datatype"/></td>
      	 <td><s:property value="datacontent"/></td>
      	 <td><s:property value="datapubltime"/></td>
      	 <!--          
      	 <td> <a href="cw_queryById.action?dataid=<s:property value="dataid"/>">详情</a></td>
      	 <td> <a href="cw_queryByid.action?dataid=<s:property value="dataid"/>">修改</a></td>
         <td> <a href="cw_delete.action?dataid=<s:property value="dataid"/>">删除</a></td>
      	 --> 
      	 <td>
      	    <button type="button" id="dataid" value="<s:property value="dataid"/>" onclick="queryById()">详情</button>
      	 </td>
      	 
      	 <td>
      	    <button type="button" id="dataid" value="<s:property value="dataid"/>" onclick="delet()">删除</button>
      	 </td>
      	 
      	 <td>
      	    <button type="button" id="dataid" value="<s:property value="dataid"/>" onclick="motify()">修改</button>
      	 </td>
      	</tr>
      	</s:iterator>
      	<tr align="center">
      	   <td colspan="8">
             <input type=button onclick="location.href='insert.jsp' " value="新增"/>
             <input type="reset"  value="重置"/>
              </td>
      	</tr>
      </table>
</body>
</html>