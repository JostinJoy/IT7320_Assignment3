package Assignment3.Assignment3;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class CallimplementationTest extends TestCase {
	Callimplementation obj;
int a,b;
	protected void setUp() throws Exception {
		obj=new Callimplementation();
		a=10;
		b=5;
		CallInteface mockobj=mock(CallInteface.class);
		when(mockobj.add(a, b)).thenReturn(a+b);
		when(mockobj.sub(a, b)).thenReturn(a-b);
		when(mockobj.mul(a, b)).thenReturn(a*b);
		when(mockobj.div(a, b)).thenReturn(a/b);
		
		obj.setCalI(mockobj);
		
	}

	
	public void testAddTwoNum() {		
		
		assertEquals(15,obj.AddTwoNum(10,5));
		
	}
public void testSubTwoNum() {		
		
		assertEquals(5,obj.SubTwoNum(10,5));
		
	}
public void testMulTwoNum() {		
	
	assertEquals(50,obj.MulTwoNum(10,5));
	
}
public void testDivTwoNum() {		
	
	assertEquals(2,obj.DivTwoNum(10,5));
	
}
	protected void tearDown() throws Exception {
		obj=null;
		a=0;
		b=0;
	}

}
