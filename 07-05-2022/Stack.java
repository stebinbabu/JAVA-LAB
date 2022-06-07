class Stack{
private int arr[];
private int top;
private int capacity;

Stack(int size){
arr = new int[size];
capacity = size;
top = -1;
}

public void push(int x){
if (isFull()){
System.out.println(&quot;Stack OverFlow!!!&quot;);

System.exit(1);
}
System.out.println(&quot;Inserting &quot; + x);
arr[++top] = x;
}
public int pop(){
if (isEmpty()) {
System.out.println(&quot;Stack is empty!!!&quot;);
System.exit(1);
}
return arr[top--];
}

public int getSize(){
return top + 1;
}
public Boolean isEmpty(){
return top == -1;
}
public Boolean isFull(){
return top == capacity - 1;
}
public void printStack(){
for (int i = 0; i &lt;= top; i++){
System.out.print(arr[i] + &quot;, &quot;);
}
}
public static void main(String[] args){
Stack stack = new Stack(5);
stack.push(1);
stack.push(2);
stack.push(3);

System.out.print(&quot;Stack : &quot;);
stack.printStack();
stack.pop();
System.out.println(&quot;\nAfter popping out&quot;);
stack.printStack();
}
}

