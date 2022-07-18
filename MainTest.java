import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


public class MainTest{
	Main main;
	@BeforeEach
	void setup() {
		main = new Main();
	}
	@Test
	void reverse1Test(){
		String str="Reverse me in reverse1";
		assertEquals("1esrever ni em esreveR", main.reverse1(str),"Should be able to reverse the reverse1");
	}
	
	
	@Test
	void reverse2Test(){
		String str="Reverse me in reverse2";
		assertEquals("2esrever ni em esreveR", main.reverse2(str),"Should be able to reverse the reverse2");
		String str2="";
		String str3=null;	
		assertEquals("", main.reverse2(str2),"Return nothing");
		assertEquals(null, main.reverse2(str3),"Return null");
	}

	
	@Test
	void reverse3Test(){
		String str="Reverse me in reverse3";
		String str2="";
		String str3=null;
		assertEquals("3esrever ni em esreveR", main.reverse3(str),"Should be able to reverse the reverse3");
		assertEquals("", main.reverse3(str2),"Return nothing");
		assertEquals(null, main.reverse3(str3),"Return null");
	}
	
	@Test
	void reverse4Test(){
		String str="Reverse me in reverse4";
		String str2="";
		String str3=null;
		assertEquals("4esrever ni em esreveR", main.reverse4(str),"Should be able to reverse the reverse4");
		assertEquals("", main.reverse4(str2),"Return nothing");
		assertEquals(null, main.reverse4(str3),"Return null");
	}
	
	@Test
	void reverse5Test(){
		String str="Reverse me in reverse5";
		String str2="";
		String str3=null;
		assertEquals("5esrever ni em esreveR", main.reverse5(str),"Should be able to reverse the reverse5");
		assertEquals("", main.reverse5(str2),"Return nothing");
		assertEquals(null, main.reverse5(str3),"Return null");
	}
}