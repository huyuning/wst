<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2019-12-27
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=7" />
    <title>江苏省卫生监督业务系统</title>
    <link href="css/main.css" rel="stylesheet" type="text/css" media="all" />
    <script language="javascript" src="js/jquery-1.4.2.min.js" type="application/javascript"></script>
</head>

<body>
<div id="header">
    <div class="logo-title">
        <h1>江苏省卫生监督业务系统</h1>
    </div>
    <div class="logout user-icon">
        欢迎登录，<span class="user-text">${username }</span> [<span class="signout-text"><a href="javascript:void(0);" onclick="window.opener=null; window.parent.close();" title="退出系统">退出系统</a></span>]
    </div>
</div>
</body>
</html>
