import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class main
{
    public static void main(String[] args) throws IOException
    {
        //FILES INCLUDED IN GIVEN DIRECTORY TRANSFORMED INTO FILES[]
        File directory = new File("/Users/bohdanmacbook/IdeaProjects/Text-files-reading-task/input");
        File[] listFiles = directory.listFiles();


        // GO THROUGH EVERY FILE AND EVERY LINE
        for(File file : listFiles)
        {
            List<String> linesOfFile = Files.readAllLines(file.toPath());
            for (String line : linesOfFile)
            {

               char[] characters = line.toCharArray();
               for(int i = 0; i < characters.length; i++)
               {
                   // WE CHECK IF CHARACTER IS NOT THE LAST ONE TO AVOID MISTAKES
                   if(i != characters.length - 1)
                   {
                       if(Character.isDigit(characters[i]) && Character.isDigit(characters[i+1]))
                       {
                           if(characters[i] - '0' >= 1)
                           {
                               System.out.println(line);
                               break;
                           }

                       }
                   }
               }
            }
        }
    }


}

