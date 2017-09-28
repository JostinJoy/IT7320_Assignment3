package Assignment3.Assignment3;

public class Callimplementation {

	CallInteface calI;
	public int AddTwoNum(int a,int b)
	{
		return calI.add(a, b);
	}

	public void setCalI(CallInteface calI) {
		this.calI = calI;
	}
	
	public int SubTwoNum(int a,int b)
	{
		
		return calI.sub(a, b);
	}
	public int DivTwoNum(int a,int b)
	{
		return calI.div(a, b);
		
	}
	public int MulTwoNum(int a,int b)
	{
		return calI.mul(a,b);
		
	}
}
