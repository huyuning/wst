package tools;

/**
 * @author hyn
 * @create 2019-12-26-15:13
 */
public class Test {
	public static void main(String[] args) {
		String password = Md5Util.encode("1");
		System.out.println(password);
	}
}
