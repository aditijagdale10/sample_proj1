

class Pattern1 {
    public static void main(String[] args) {
		        
        	int x=1;
        	char ch='A';
 
        	for(int i= 1; i<=5;i++){

            		for(int j = 1; j<=i;j++){


                		if(i%2!=0){
                    			System.out.print(x + " ");
                    
                		}	
                		else{
                    
                   			System.out.print(ch + " ");
                   
                		}
			x++;
			ch++;

	    }
                System.out.println();
                
            }
        }
    }

