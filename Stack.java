public class Stack {

public static final int CAPACITY=1000;
private int capacity;
private Object elements[];
private int top=-1;
  public Stack(int capacity){
if (capacity>0){
this.capacity=capacity;
elements=new Object[capacity];
}else{
this.capacity=CAPACITY;
elements=new Object[CAPACITY];
}

}
public Stack(){

this(CAPACITY);

}
public boolean isEmpty(){
return (top<0);

}

public boolean isFull(){

return (top==capacity-1);

}
public int size(){
return (top+1);

}
public void push (Object o) throws StackFullException {

if (isFull()){
throw new StackFullException ("Stack Overflow!");

}
else {
top++;
elements[top]=o;
}
}
public Object pop () throws StackEmptyException{

Object elem;
if (isEmpty()){
throw new StackEmptyException("Stack Underflow!");
}
else {
elem=elements[top];
elements[top]=null;
top--;
return (elem);}
}
public Object top () throws StackEmptyException {

if (isEmpty()){
throw new StackEmptyException("Stack Underflow!");
}
else {
return (elements[top]);
}

}
public void exibirTodosElementos() {
   System.out.println("Todos os elementos da Pilha: ");
   for (int i = top; i >= 0; i--) {
      System.out.println(elements[i]);
   }
}
}