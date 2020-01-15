<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2019-12-26
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%
    String path=request.getContextPath();
    String basePath= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=7" />
    <title>江苏省卫生监督综合管理信息系统 | 登录</title>
    <link href="css/main.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/validationEngine.jquery.css" rel="stylesheet" type="text/css" media="all" />
    <style>
        html, body { overflow:hidden;}
    </style>
    <script language="javascript" type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script language="javascript" type="text/javascript" src="js/jquery.validationEngine.js"></script><!--表单验证-->
    <!--[if IE 6]>
    <script type="text/javascript" src="js/pngfix/unitpngfix.js"></script>
    <![endif]-->
    <script language="javascript" type="text/javascript">
        function formSubmit(obj){
            $("#"+obj+"").submit();
        }
        function formReset(obj){
            $("#"+obj+" input").attr("value","");
        }
    </script>
</head>

<body class="loginPage">
<div id="loginPage-wrap">
    <div class="loginPage-logo-title"></div>
    <div class="loginPage-main">
        <form id="login" name="login" action="user?type=login" method="post">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td align="right">用户名：</td>
                    <td><input class="validate[required] text-input" type="text" name="username" id="username" /></td>
                </tr>
                <tr>
                    <td align="right">密&nbsp;&nbsp;码：</td>
                    <td><input class="validate[required] text-input" type="password" name="password" id="password" /></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <img src="images/login-submit.gif" onclick="formSubmit('login')" class="cursorPointer" />
                        <img src="images/login-reset.gif" onclick="formReset('login')" class="cursorPointer" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <div class="loginPage-copyright">
        <p>&copy; 2010 江苏省卫生厅</p>
    </div>
</div><!--//loginPage wrap-->
</body>
</html>
