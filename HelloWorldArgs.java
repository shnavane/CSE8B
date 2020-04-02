public class HelloWorldArgs{
    public static void main (String [] args){
      System.out.println("Number of Command Line Argument(s) = "+args.length);	

      for(int i = 0; i< args.length; i++) {
	System.out.println(String.format("Hello World %s (position %d) ", args[i], i));
      }
    }
}
