public class MultipleTF{

public static int multiple () {
		
		
      int suma=0;
      int num1 = 3;
      int num2 = 5;
      int number = 1000;
     
		
		for(int i=num1;i<number;i++) {
			
			if(i%num1==0) {
				suma=suma+i;
				
			}else if(i%num2==0) {
				suma=suma+i;
				
			}
			
		}
		
		return suma;
	}
  }
