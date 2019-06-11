package _010_IsMatch_0402;

public class AnswerRef {
	public static void main(String[] args) {
		String s = "aab", p = "c*aa*b";
		boolean b = isMatch(s, p);
		System.out.println(b);
	}

	private static boolean isMatch(String s, String p) {
		if(p.isEmpty()) return s.isEmpty();
		boolean  firstmatch = (!s.isEmpty()&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.'));
		if(p.length()>=2&&p.charAt(1)=='*') {
			return (isMatch(s, p.substring(2))||(firstmatch&&isMatch(s.substring(1), p)));
			//出现0次和第一个匹配上本次p不计数
		}else {
			return firstmatch&&isMatch(s.substring(1), p.substring(1));
		}
	}
}
