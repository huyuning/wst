package tools;

/**
 * @author hyn
 * @create 2020-01-02-12:42
 */
public class Mytools {
	public static String liuShui3(Long l){
		String str = l.toString();
		String str0 = "";
		for(int i=0;i<3-str.length();i++){
			str0 = "0"+str0;
		}
		str=str0+str;
		return str;
	}
	
}
