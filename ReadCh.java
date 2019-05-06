class ReadCh {
   public static void main(String args[]) 
   throws java.io.IOException {
   char ch;
   do {
   ch= (char)System.in.read();
   System.out.println("you entered" + ch);
   } while( ch != 't');
  }
}
