<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main页面</title>
<script type="text/javascript"></script>
<script >
function insert(){
	  // var dataid = document.getElementById("dataid").value;
	   var datatitle = document.getElementById("datatitle").value;
	   var datatype = document.getElementById("datatype").value;
	   var datacontent = document.getElementById("datacontent").value;
	   var datapubltime = document.getElementById("datapubltime").value;

	   
	   if(datatitle == ""  ){
	    alert("密码不能为空");
	     return false;
	   }
	   if(datatype == ""  ){
		    alert("密码不能为空");
		     return false;
		   }
	   if(datacontent == ""  ){
		    alert("密码不能为空");
		     return false;
		   }
	   if(datapubltime == ""  ){
		    alert("密码不能为空");
		     return false;
		   }
	  document.getElementById("formid").submit();
	}



</script>
</head>
<body>
      <form id="formid" method="post" action="cw_insert.action">
      <table border="1">
   <!--<tr>
		    <td>编号<input name="dataid"  id="dataid" value=""/></td>
		</tr>  -->
		<tr>
		    <td>主题<input name="datatitle"  id="datatitle" value=""/></td></tr>
		<tr>   
		    <td>类型<input name="datatype"  id="datatype" value=""/></td></tr>
		<tr>    
		    <td>内容<input name="datacontent"  id="datacontent" value=""/></td></tr>
		<tr>    
		    <td>时间<input name="datapubltime"  id="datapubltime" value=""/></td>
        </tr>
     
       <tr align="center">
      	   <td colspan="5">
      	   		<input type="button" onclick="insert()" value="保存"/>
                <input type="reset"  value="重置"/>
      	   </td>
      	      	
       </tr>
      </table>
      </form>
</body>
</html>