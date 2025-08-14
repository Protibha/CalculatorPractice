import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MainByteArrayInputStreams {
    public static void main(String [] args){
        byte[] data={72,101,108,108,111};//ASCI
        ByteArrayInputStream inputStream = null;
        try{
            inputStream=new ByteArrayInputStream(data);
            int byteData;
            while((byteData = inputStream.read())!= -1) {
                System.out.print((char)byteData);
            }
        }catch(Exception e){
            System.out.println("Error during Input Streams");
        }finally {
            if(inputStream!=null){
                try{
                    inputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

            }
        }
    }
}
