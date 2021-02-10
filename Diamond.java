class Diamond{
     public static void main (String a[]){
         Diamond diamond = new Diamond();
         diamond.triangle(5);
         diamond.reverseTriangle(5);
		 diamond.rombos(5);
        }
 
       void triangle(int n){
         int mid=n/2;
            for(int i=0;i<n-n/2;i++){
                for(int j=0;j<n;j++){
                    if(i+j==mid||j-i==mid||i==mid){
                      System.out.print("*");
                    }
                   else{
                     System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
   
 
       void reverseTriangle(int n){
         int mid=n/2;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i+j==(mid*3)||i-j==mid||i==mid){
                     System.out.print("*");
                    }
                   else{
                     System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    
	
	   void rombos(int n){
         int mid=n/2;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i+j==(mid*3)||i-j==mid||i+j==mid||j-i==mid){
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