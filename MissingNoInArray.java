

public class MissingNoInArray{

	public static void main(String[] args) {
	    int diff, b=1, temp;
	    int a[] = {1,2,6,5,3,19,16,14};
	    for (int i=1; i<a.length; i++){
	        for (int j=i;j>0;j--){
	            if(a[j]<a[j-1]){
	                temp = a[j];
	                a[j]= a[j-1];
	                a[j-1] = temp;
	            }
	                
	            }
	        }
	        System.out.println("sorted array is :- ");
	        for (int i=0; i<a.length; i++){
	        
	        System.out.print(" " +a[i]);
	        }
	   
	    for (int i=0; i<3;i++){
	        diff = a[i+1]-a[i];
	        if(diff>1){
	          b = b+a[i];
	        }
	    }
	    
		System.out.println("\nmissing smallest no is "+b);
}
}

