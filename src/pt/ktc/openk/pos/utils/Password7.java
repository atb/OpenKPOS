package pt.ktc.openk.pos.utils;

public class Password7 {
	// "83hdgsinfjr3gdhowc6hf"
	public static char c='\u0069';
	
	public static String getChar(int parm) {
		int x=(int)c;
		String s="";

		if (parm>127) {
			x = (x << 4) / 16;
			s=s+String.valueOf((char)x);
		}
		else if ((parm>0) && (parm<=127))
		{
			x = ((x << 5) >>> 2) / 8;
			s=s+String.valueOf((char)x);
		}
		else 
		{
			s=s+String.valueOf((char)(x<(-123)?' ':'\023'));
		}
		return s.trim();
	}
}
