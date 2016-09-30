import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Main {
	
	public static void main(String[] args){

	}
	
	public static int stackHeight(ArrayList<Box> al){
		int height=0;
		for(Box b:al){
			height+=b.h;
		}
		return height;
	}
	
	public static ArrayList<Box> createStack(Box[] a){
		ArrayList<Box> al=new ArrayList<Box>();
		int height=0;
		for(Box b:a){
			ArrayList<Box> tempAl=createStack(a,b);
			int tempH=stackHeight(tempAl);
			if(tempH>height){
				al=tempAl;
			}
		}
		return al;
	}
	
	public static ArrayList<Box> createStack(Box[] a, Box bottom){
		
		int max_height=0;
		ArrayList<Box> max_stack=null;
		for(int i=0;i<a.length;i++){
			if(a[i].CanBeAbove(bottom)){
				ArrayList<Box> new_stack=createStack(a,a[i]);
				int new_height=stackHeight(new_stack);
				if(new_height>max_height){
					max_stack=new_stack;
					max_height=new_height;
					
				}
			}
		}
		
		if(max_stack==null){
			max_stack=new ArrayList<Box>();
		}
		
		if(bottom!=null){
			max_stack.add(0, bottom);
		}
		return max_stack;
		
	}

}
