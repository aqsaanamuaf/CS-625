class ChCase {
  public static void main(String args[]) 
  throws java.io.IOException {
   char ch;
   int count=0;
   System.out.println("press 9 to stop");
   do {
   ch = (char)System.in.read();
    if(ch>='a' & ch<='z'){
    System.out.println("character in lower case:" + ch);
    ch=(char)(ch-32);
    System.out.println("character in upper case:" + (char)ch);
    count +=1;
    }
    else if(ch>='A' & ch<='Z'){
    System.out.println("character in upper case:" + ch); 
    ch=(char)(ch+32);
    System.out.println("character in lower case:" + (char)ch);
    count +=1;
    }
    else{
    System.out.println("invalid character");
     }
    }while( ch != '9');
    System.out.println("total case changes:" + count);
   }
}