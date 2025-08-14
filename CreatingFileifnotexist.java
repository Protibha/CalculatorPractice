import java.io.*;
public class CreatingFileifnotexist {
    public static void main(String[] args){
        String filepath="Day24/src/main/resources/newFile.txt";

        File file= new File(filepath);
        if(file.exists() ){
            System.out.println("File Exists!");
        }
        else{
            System.out.println("File does not exist, creating it...");
            try{
                if(file.createNewFile()){
                    System.out.println("File created "+file.getName());
                }else{
                    System.out.println("Failed to create file");
                }
            }catch(IOException e){
                System.out.println("An error occured while creating a file");
                e.printStackTrace();
            }

        }

        System.out.println("File name "+file.getName());
        System.out.println("FIle path: "+file.getPath());
    }
}
