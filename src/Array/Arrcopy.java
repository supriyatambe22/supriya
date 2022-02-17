package Array;

public class Arrcopy {

	public static void main(String[] args) {
       int[] src= {100,200,300};
       int dest[]=new int[3];
       System.arraycopy(src, 0, dest,0, src.length);
       for(int i=0;i<dest.length;i++
    		   )
       System.out.println("element at" +i+ ":"+dest[i]);
	}

}
