
public class Box {
	
	int w,h,d;
	public Box(int w, int h, int d){
		this.w=w;
		this.h=h;
		this.d=d;
	}
	
	public boolean CanBeAbove(Box b){
		return w<b.w && h<b.h && d<b.d;
	}

}
