package servlet;


import com.google.gson.Gson;
import service.OrgService;
import service.OrgserviceImpl;
import vo.OrgCondition;
import vo.TD0OrganizationEntity;
import vo.TD0OrgattachedEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author hyn
 * @create 2019-12-26-09:59
 */
@WebServlet(name = "OrgServlet")
public class OrgServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrgService service = new OrgserviceImpl();
		String type = request.getParameter("type");
		switch (type){
			case "add":
				String orgno             = request.getParameter("orgno");
				String orgcode           = request.getParameter("orgcode");
				String orgname           = request.getParameter("orgname");
				String orgPro           = request.getParameter("orgPro");
				String exetype           = request.getParameter("exetype");
				String linkaddr              = request.getParameter("addr");
				String zipcode              = request.getParameter("zipcode");
				String areacode          = request.getParameter("areacode");
				String listingdate       = request.getParameter("listingdate");
				String standalonedate    = request.getParameter("standalonedate");
				String areatype          = request.getParameter("areatype");
				String onworkerNum       = request.getParameter("onworkerNum");
				String supervisorNum     = request.getParameter("supervisorNum");
				String orgLevel          = request.getParameter("orgLevel");
				String zbbdocDate        = request.getParameter("zbbdocDate");
				String retireNum         = request.getParameter("retireNum");
				String zbbNum            = request.getParameter("zbbNum");
				String builidingOwnership    = request.getParameter("builidingOwnership");
				String officeBuildarea    = request.getParameter("officeBuildarea");
				String officeBuildingarea    = request.getParameter("officeBuildingarea");
				String ifpublicmanage = request.getParameter("ifpublicmanage");
				String funDivCount             = request.getParameter("funDivCount");
				String orgCount             = request.getParameter("orgCount");
				String businessDivCount             = request.getParameter("businessDivCount");
				String equ3Count             = request.getParameter("equ3Count");
				String equ2Count             = request.getParameter("equ2Count");
				String equ1Count             = request.getParameter("equ1Count");
				String busCount             = request.getParameter("busCount");
				String rapidtestvehicleCount             = request.getParameter("rapidtestvehicleCount");
				String motorCount             = request.getParameter("motorCount");
				String cameraCount             = request.getParameter("cameraCount");
				String videoCount             = request.getParameter("videoCount");
				String copycatNum             = request.getParameter("copycatNum");
				String computerNum           = request.getParameter("computerNum");
				String notepadNum          = request.getParameter("notepadNum");
				String serverCount           = request.getParameter("serverCount");
				String pbxCount          = request.getParameter("pbxCount");
				String faxCount             = request.getParameter("faxCount");
				String ohpCount             = request.getParameter("ohpCount");
				String vrCount             = request.getParameter("vrCount");
				String yearly = request.getParameter("yeatly");
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				try {
					TD0OrganizationEntity org = new TD0OrganizationEntity(
							0,orgno,orgcode,orgname,exetype,
							areacode,linkaddr,sdf.parse(listingdate),sdf.parse(standalonedate),areatype,
							sdf.parse(zbbdocDate),orgLevel,orgPro,zipcode);
					TD0OrgattachedEntity info = new TD0OrgattachedEntity(0,0,
							orgname,orgno,orgcode,Double.parseDouble(onworkerNum),Double.parseDouble(supervisorNum),
							Double.parseDouble(zbbNum),ifpublicmanage,Double.parseDouble(retireNum),Double.parseDouble(officeBuildarea),
							builidingOwnership,Double.parseDouble(officeBuildingarea),Double.parseDouble(businessDivCount),
							Double.parseDouble(funDivCount),Double.parseDouble(orgCount),Double.parseDouble(equ3Count),
							Double.parseDouble(equ2Count), Double.parseDouble(equ1Count),Double.parseDouble(busCount),
							Double.parseDouble(rapidtestvehicleCount),Double.parseDouble(motorCount),Double.parseDouble(cameraCount),Double.parseDouble(videoCount),
							Double.parseDouble(copycatNum),Double.parseDouble(computerNum),Double.parseDouble(notepadNum),Double.parseDouble(serverCount),
							Double.parseDouble(pbxCount),Double.parseDouble(faxCount),Double.parseDouble(ohpCount),yearly,Double.parseDouble(vrCount));
					service.addOrg(org,info);
				} catch (Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect("org?type=list");
				break;
			case "list":
				String page = request.getParameter("page");
				String count = request.getParameter("count");
				if (page==null||page.length()==0){
					page="1";
				}
				if (count==null||count.length()==0){
					count="8";
				}
				List<TD0OrganizationEntity> list = service.getByPage(Integer.parseInt(page),Integer.parseInt(count));
				request.setAttribute("data",list);
				request.getRequestDispatcher("institution-list.jsp").forward(request,response);
//				response.sendRedirect("institution-list.jsp");
				
				break;
			case "jquery":
				String exetype_query =  request.getParameter("exetype");
				String orgname_query =  request.getParameter("orgname");
				String addr_query =  request.getParameter("addr");
				String orgno_query =  request.getParameter("orgno");
				String areacode_query =  request.getParameter("areacode");
				String zipcode_query =  request.getParameter("zipcode");
				String orgPro_query =  request.getParameter("orgPro");
				OrgCondition con = new OrgCondition(exetype_query,orgname_query,addr_query,orgno_query,areacode_query,zipcode_query,orgPro_query);
				List<TD0OrganizationEntity> list_query = service.getByCondition(con);
//				PrintWriter out = response.getWriter();
//				request.setAttribute("data",list_query);
//				request.getRequestDispatcher("institution-list.jsp").forward(request,response);
//				out.print();
//				out.flush();
//				out.close();
				new Gson().toJson(list_query);
				break;
			case "page":
				String page1 = request.getParameter("page");
				String count1 = request.getParameter("count");
				if (page1==null||page1.length()==0){
					page1="1";
				}
				if (count1==null||count1.length()==0){
					count1="8";
				}
				List<TD0OrganizationEntity> list1 = service.getByPage(Integer.parseInt(page1),Integer.parseInt(count1));
				//request.setAttribute("data",list1);
				PrintWriter out = response.getWriter();
				out.print(new Gson().toJson(list1));
				out.flush();
				out.close();
		}
	}
}
