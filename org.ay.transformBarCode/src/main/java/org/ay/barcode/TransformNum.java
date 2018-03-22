package org.ay.barcode;

public class TransformNum {
	private String code;
	public TransformNum(String code) {
		this.code = code.substring(1, code.length() -1);
	}

	public String convert2Num() {
		String numStr = code.replaceAll(":", "0").replaceAll("\\|", "1");
		StringBuilder sb = new StringBuilder();
		StringBuilder num = new StringBuilder();
		for(int i = 0;i < numStr.toCharArray().length;i++) {
			sb.append(numStr.toCharArray()[i]);
			if((i+1) % 5 == 0) {
				num.append(toNum(sb.toString()));
				if((i+1) % 25 == 0) {
					num.append("-");
				}
				sb = new StringBuilder();
			}
		}
		return num.toString();
	}
	
	private String toNum(String str) {
		for(int i = 0;i < TransformCode.codes.length;i++) {
			if(str.equals(TransformCode.codes[i])) {
				return Integer.toString(i);
			}
		}
		return "";
	}

	public String print() {
		String num = convert2Num();
		System.out.println(num);
		return num;
	}

}
