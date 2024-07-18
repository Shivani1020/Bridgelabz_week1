class Sum{
      public static void main(String[] args){
	int sum = 0;
	int i;
	for (i=1; i<=100; i++)
        {
	    if(i%7 == 0){
		sum +=i;}
	    else
		continue;
        }
	System.out.println("sum of all numbers between 1 and 100 that are divisible by 7 is "+sum);
      }
}
