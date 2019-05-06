class ReCh {
public static void main(String args[]) 
throws java.io.IOException {
 char ch;
  do{
    ch = (char) System.in.read();
    System.out.print("ch is" + ch);
    }
  while(ch != 'q');
 }
}