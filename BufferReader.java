package jdbc;
import java.io.*;  
public class BufferedReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("C:\\Users\\chanair\\Desktop\\161725-Chandni Nair\\BufferReader.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}  