package org.ay.barcode;

import org.junit.Assert;
import org.junit.Test;

public class BarCodeTest {

	@Test
	public void should_generate_code_from_num() {
		String num =  "45056-1234";
		TransformCode trans = new TransformCode(num);
		String code = trans.convert2Code();
		Assert.assertEquals("010010101011000010100110000011001010011001001", code);
		Assert.assertEquals("|:|::|:|:|:||::::|:|::||:::::||::|:|::||::|::||", trans.print());;
	}
	
	@Test
	public void should_generate_num_from_code() {
		String code= "|:|::|:|:|:||::::|:|::||:::::||::|:|::||::|::||";
		TransformNum trans = new TransformNum(code);
		String num = trans.convert2Num();
		Assert.assertEquals("45056-1234",num);
		Assert.assertEquals("45056-1234", trans.print());
	}
}
