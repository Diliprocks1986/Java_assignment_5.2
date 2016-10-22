import myPack.Stack;

class FixedStack implements Stack {
	private int stck[];
	private int tos;
	//FixedStack constructor
	FixedStack(int size){
		stck = new int[size];
		tos = -1;
	}
	// Push an item into the stack 
	public void push(int i){
		if(tos == stck.length-1){
			System.out.println("Stack is Full");
		}else{
			stck[++tos] = i;
		}
	}
	// Pop an item from the stack 
	public int pop() { 
	if(tos < 0) { 
	System.out.println("Stack Overflow"); 
	return 0; 
	} else 
	return stck[tos--]; 
} 	
}
class VariableStack implements Stack {
	private int stck[];
	private int tos;
	//VariableStack constructor
	VariableStack(int size){
	stck = new int[size];
		tos = -1;
	}
	// Push an item into the stack 
	public void push(int i){
			
		if(tos == stck.length-1){
			int temp[]= new int [stck.length*2];
			for(int j =0;j<stck.length;j++)temp[j] = stck[j];
			stck = temp;
			stck[++tos] = i;			
		}else{
			stck[++tos] = i;
		}
	}
	// Pop an item from the stack 
	public int pop() { 
	if(tos < 0) { 
	System.out.println("Stack Overflow"); 
	return 0; 
	} else 
	return stck[tos--]; 
} 	
}
public class test { 
public static void main(String args[]) { 
FixedStack fs = new FixedStack(5);
VariableStack vs = new VariableStack(4);
// push some numbers onto the stack 
for(int i=0; i<5; i++) fs.push(i);
for(int i=0; i<4; i++) vs.push(i);

// pop those numbers off the stack 
System.out.println("Stack in myFixedStack1:"); 
for(int i=0; i<5; i++) 
System.out.println(fs.pop());
System.out.println("Stack in myVariableStack1:"); 
for(int i=0; i<15; i++) 
System.out.println(vs.pop());

} 
}
