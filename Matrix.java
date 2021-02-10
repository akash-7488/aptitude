class Matrix{
    public static void main (String a[]){
	  Matrix matrix=new Matrix();
	  matrix.rightangleT(7);
	   matrix.lRightangleT(7);
	    matrix.diagonal(7);
		 matrix.plus(7);
	  
	}
      void rightangleT(int n){
	        for(int i=1;i<=n;i++){
		        for(int j=1;j<=n;j++){
		            if(i==7||j==7||i+j==n){
				      System.out.print("*");
				    }			
		            else{
				     System.out.print(" ");
				    }
		        }
		        System.out.println();
		    }
	  
	    }	

    void lRightangleT(int n){
	        for(int i=1;i<=n;i++){
		        for(int j=1;j<=n;j++){
		            if(i==n||j==1||i==j){
				      System.out.print("*");
				    }			
		            else{
				     System.out.print(" ");
				    }
		        }
		        System.out.println();
		    }
	  
	    }	
    
    void diagonal(int n){
	        for(int i=1;i<=n;i++){
		        for(int j=1;j<=n;j++){
		            if(i==j){
				      System.out.print("*");
				    }			
		            else{
				     System.out.print(" ");
				    }
		        }
		        System.out.println();
		    }
	  
	    }	

    void plus(int n){
		int mid=n/2;
	        for(int i=1;i<=n;i++){
		        for(int j=1;j<=n;j++){
		            if(i==mid+1||j==mid+1){
				      System.out.print("*");
				    }			
		            else{
				     System.out.print(" ");
				    }
		        }
		        System.out.println();
		    }
	  
	    }	

}