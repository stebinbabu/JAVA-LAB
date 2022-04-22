class Array2 {
   public static void main(String[] args){

	 int [] a= {2,3,44,31,12,1,55};
	 int max= a[0];
	 for(int i=0;i < a.length;i++){
		 if (a[i]>max)
			 max=a[i];
	 }
		 System.out.println(" largest element, "+max);
	 
	
  }
}  