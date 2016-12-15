<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>queryById</title>
<script type="text/javascript"></script>

</head>
<body>
      <form id="formid" method="post" action="cw_update.action">
      <table border="1">
      <s:iterator value="record">
      	<tr>
		    <td>编号<input readOnly="true"name="dataid"  id="dataid" value="<s:property value="dataid"/>"  /></td>
		</tr>
		<tr>
		    <td>主题<input readOnly="true" name="datatitle"  id="datatitle" value="<s:property value="datatitle"/>"/></td></tr>
		<tr>   
		    <td>类型<input readOnly="true" name="datatype"  id="datatype" value="<s:property value="datatype"/>"/></td></tr>
		<tr>    
		    <td>内容<input readOnly="true" name="datacontent"  id="datacontent" value="<s:property value="datacontent"/>"/></td></tr>
		<tr>    
		    <td>时间<input readOnly="true" name="datapubltime"  id="datapubltime" value="<s:property value="datapubltime"/>"/></td>
        </tr>
     
       
       </s:iterator>
      </table>
      </form>
</body>
</html>