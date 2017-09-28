package Assignment3.Assignment3;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class CallimplementationTest extends TestCase {
	Callimplementation obj;
int a,b;
double c,d;
//dddd

	protected void setUp() throws Exception {
		obj=new Callimplementation();
		a=9;
		b=2;
		c=(double)a;
		d=(double)b;
		
		CallInteface mockobj=mock(CallInteface.class);
		when(mockobj.add(a, b)).thenReturn(a+b);
		when(mockobj.sub(a, b)).thenReturn(a-b);
		when(mockobj.mul(a, b)).thenReturn(a*b);
		when(mockobj.div(a, b)).thenReturn(c/d);
		
		obj.setCalI(mockobj);
		
	}

	
	public void testAddTwoNum() {		
		
		assertEquals(11,obj.AddTwoNum(9,2));
		
	}
public void testSubTwoNum() {		
		
		assertEquals(7,obj.SubTwoNum(9,2));
		
	}
public void testMulTwoNum() {		
	
	assertEquals(18,obj.MulTwoNum(9,2));
	
}
public void testDivTwoNum() {		
	
	assertEquals(4.5,obj.DivTwoNum(9,2));
	
}
	protected void tearDown() throws Exception {
		obj=null;
		a=0;
		b=0;
	}

}
