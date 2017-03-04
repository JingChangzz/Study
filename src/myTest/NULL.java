package myTest;
public class NULL {

public static void print(){
System.out.println("MTDP");

boolean result=false?false:true==false?true:false;
System.out.println(""+result+"");

}
public static void main(String[] args) {
try{
((NULL)null).print(); 
}catch(NullPointerException e){
System.out.println("NullPointerException");
}
}
}