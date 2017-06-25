public class Calculate2{
	private int result=1;
	public void mult(int ... values){
	for (int val : values){
		this.result*=val;
		}
	}
	public int getres(){return this.result;}
	public void clearres(){this.result=1;}
}