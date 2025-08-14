
import java.io.*;

public class Main {
    public static void main(String[] args){
       // String data= "Hello Everyone we are learning fos/bos Java";
        try(FileOutputStream fos=new FileOutputStream("Day24/src/main/resources/output.bin" );
            //BufferedOutputStream bos =new BufferedOutputStream(fos)
            DataOutputStream dos = new DataOutputStream(fos)
        ){
            //byte[] bytesArray=data.getBytes();
            //bos.write(bytesArray);
            //bos.flush();
            dos.writeDouble(3.14);
            dos.writeChar('H');
            dos.writeInt(42);
            dos.writeUTF("This is a string");
            dos.flush();

            System.out.println("Data written");
        //}//catch(FileNotFoundException e){
           // throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
