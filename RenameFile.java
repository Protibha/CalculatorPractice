import java.io.File;
//import java.io.IO;
import java.io.IOException;

public class RenameFile {
    public static void main(String[] args){
        String filePath="Day24/src/main/resources/newFile.txt";

        String renamedFilepath="Day24/src/main/resources/newFilechanged.txt";

        File file= new File(filePath);
        if(file.exists()){
            System.out.println("File exists!");

        }else{
            System.out.println("File does not exist creating it");

            try{
                if(file.createNewFile()){
                    System.out.println("File created");
                }else{
                    System.out.println("Failed to create file");
                }
            }catch(IOException e){
                System.out.println("An error occured while creating the file");
                e.printStackTrace();
            }
        }
        File renamedFile= new File(renamedFilepath);
        if(file.renameTo(renamedFile)){
            System.out.println("File renamed "+renamedFile.getName());
        }else{
            System.out.println("File renaming failed ");
        }
    }
}
