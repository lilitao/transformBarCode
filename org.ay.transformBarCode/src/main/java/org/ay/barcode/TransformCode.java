package org.ay.barcode;

public class TransformCode {
	private String num;
	public static String[] codes = new String[10];

	static{
		codes[0] ="11000";
		codes[1] ="00011";
		codes[2] ="00101";
		codes[3] ="00110";
		codes[4] ="01001";
		codes[5] ="01010";
		codes[6] ="01100";
		codes[7] ="10001";
		codes[8] ="10010";
		codes[9] ="10100";
		
	}
	public TransformCode(String num) {
		this.num = num.replaceAll("-", "");
	}

	public String convert2Code() {
		StringBuilder sb = new StringBuilder();
		for(char c:num.toCharArray()) {
			sb.append(codes[Integer.parseInt(Character.toString(c))]);
		}
		return sb.toString();
	}
	
	public String print() {
		String code = this.convert2Code();
		code = code.replaceAll("0", ":").replaceAll("1", "|");
		code = "|" + code +"|";
		System.out.println(code);
		return code;
	}

}
