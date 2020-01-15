<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2020-01-01
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path=request.getContextPath();
    String basePath= request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=7" />
    <title>江苏省卫生监督业务系统</title>
    <link href="<%=basePath %>css/main.css" rel="stylesheet" type="text/css" media="all" />
    <script src="js/jquery-1.4.2.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        function x() {
             $.getJSON("org?type=query",
                 $("#form-search").serialize(),
             function (data) {
                 alert(data)
             });
        }
    </script>
</head>

<body class="content-pages-body">
<div class="content-pages-wrap">
    <div class="commonTitle">
        <h2>&gt;&gt;机构信息查询</h2>
    </div>
    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="commonTableSearch">
        <form id="form-search" name="form-search" action="org?type=jquery" method="post">
            <tr>
                <th align="right">行政类别：</th>
                <td><select name="exetype" id="select">
                    <option value="">卫生监督机构</option>
                    <option value="">行政部门</option>
                    <option value="">协作单位</option>

                </select></td>
                <td><div align="right">机构名称：</div></td>
                <td><input name="orgname" type="text" class="inputTextNormal" id="textfield6" /></td>
                <td align="right">机构代码：</td>
                <td align="right"><input name="orgno" type="text" class="inputTextNormal" id="textfield62" /></td>
                <td align="right">机构地址：</td>
                <td align="right"><input name="addr" type="text" class="inputTextNormal" id="textfield622" /></td>
            </tr>
            <tr>
                <th align="right">行政编码：</th>
                <td><input name="areacode" type="text" class="inputTextNormal" id="textfield63" value="用地址进行后台匹配" /></td>
                <td align="right"><span class="required">*</span>机构性质：</td>
                <td>
                    <select name="orgPro" id="select5">
                        <option value="0">请选择</option>
                        <option value="1">行政机构</option>
                        <option value="2">全额拔款事业单位</option>
                        <option value="3">差额拔款事业单位</option>
                        <option value="4">自收自支事业单位</option>
                        <option value="5">其他</option>
                    </select>
                </td>
                <td></td>
                <td></td>
                <td></td>
                <td align="right"><button href="javascrip:void(0)" onclick="x()">检索</button></td>
            </tr>
        </form>
    </table>
    <!--//commonTableSearch-->
    <div class="btnBar">
        <ul class="clearfix">
            <li><a href="institution-creat.jsp" title="创建机构" class="btnNormal">新增</a></li>
        </ul>
    </div>
    <div id="list">
        <table border="0" cellspacing="1" cellpadding="0" class="commonTable">
            <tr>
                <th width="7%">机构代码</th>
                <th>机构名称</th>
                <th width="8%">机构类型</th>
                <th>机构地址</th>
                <th width="8%">成立日期</th>
                <th width="7%">机构性质</th>
                <th class="editColM">操作</th>
            </tr>
            <c:forEach items="${data }" var="org">
                <tr id="commonTab">
                    <td align="center">${org.orgNo }</td>
                    <td align="left"><a href="jsp/institution-view.jsp">${org.orgName }</a></td>
                    <td align="center">${org.exeType }</td>
                    <td align="left">${org.linkAdd}</td>
                    <td align="center">${org.standaloneDate }</td>
                    <td align="center">${org.orgPro }</td>
                    <td align="center">
                        <a href="institution-view.html" class="btnIconView" title="查看详情"></a>
                        <a href="institution-creat.html" class="btnIconEdit" title="更新"></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

    <script type="text/javascript">

    </script>
    <!--//commonTable-->
    <div id="pagelist">
        <ul class="clearfix">
            <li><a href="#">首页</a></li>
            <li><a href="#">上页</a></li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li class="current"><a>3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#">下页</a></li>
            <li><a href="#">尾页</a></li>
            <li class="pageinfo">第3页</li>
            <li class="pageinfo">共8页</li>
        </ul>
    </div>
    <script type="text/javascript">

        $(function () {
            $(".clearfix li").click(function () {
                var page=$(this).children().html()
                $(this).siblings('li').removeClass('current')
                $.getJSON("org?type=page","page="+page,function (data) {
                    var s = "<tabal border='0' cellspacing='1' cellpadding='0' class='commonTable'>"
                    s+="<tr><th weight='7%'>机构代码</th><th>机构名称</th><th weigth='8'>机构类型</th><th>机构地址</th><th weight='8'>成立日期</th><th weight='7'>机构性质</th><th class='editColM'>操作</th></tr>"
                    $.each(data,function (i,o) {
                        s+="<tr><td>+o.id+</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>"

                    })
                    s+="</table>"
                    $("#list").replaceWith(s)
                })
                $(this).addClass('current')
            })
        })
    </script>
</div>
<!--//content pages wrap-->
</body>
</html>
