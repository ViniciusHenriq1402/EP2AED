package EP2AED.pilha2;

public class ArranjoCap {
	 
	  public static final int CAPACITY = 8;
	  private Integer pilha[];
	  private int n;


	  public ArranjoCap(){
	    
	    pilha = new Integer[CAPACITY];
	    n = 0;
	  }

	  

	  public boolean isEmpty(){ return n == 0; }

	  public void push(Integer e) {
		

	    if(n == pilha.length){
			resize(2 * pilha.length);
		}

	   	pilha[n] = e;
	    n++;
	  }

	  public Integer pop() {
		Integer tmp = pilha[--n];
	    return tmp;
	  }

	 public void resize(Integer cap) {
		
		Integer[] temp =  new Integer[cap];
		for (int i = 0; i < n; i++) {
			temp[i] = pilha[i];
		}
			pilha = temp;
			
	 }

	  

	  public String toString() {
	    String s = "[";
	    if(!isEmpty()) s += pilha[0];
	    for(int i = 1; i < n; i++)
	      s += ", " + pilha[i];
	    return s + "]";
	  }
}
