package D7;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // try (FileWriter writer = new FileWriter("data.txt")){
        //     writer.write("google\n");
        //     writer.write("Amazon\n");
        // } catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
        // try (FileWriter writer = new FileWriter("data.txt",true)){
        //     writer.write("Microsoft");
        // } catch(IOException e){
        //     System.out.println(e.getMessage());
        // }
        // try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
        //     String line;
        //     while ((line= reader.readLine())!=null){
        //         System.out.println(line);
        //     }
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }

        // Path path = Path.of("companies.txt");
        // if (!Files.exists(path)){
        //     try {
        //         Files.writeString(path,"Google\nAmazon\nMicrosoft");
        //     }catch(IOException e){
        //         System.out.println(e.getMessage());
        //     }
        // }
        // try{
        //     List<String> lines = Files.readAllLines(path);
        //     for (String line:lines){
        //         System.out.println(line);
        //     }
        //     System.out.println(lines.size());
        // } catch (IOException e){
        //     System.out.println(e.getMessage());
        // }
        JobApplicationManager manager = new JobApplicationManager();
        FileStorage storage = new FileStorage();
        manager.addApplication(
            new JobApplication(1, "Google", "Backend", "APPLIED")
        );

        manager.addApplication(
            new JobApplication(2, "Amazon", "SDE", "INTERVIEW")
        );
        storage.saveToFile((manager.getAllApplications()));
        List<JobApplication> jobs = storage.loadFromFile();
        for (JobApplication job:jobs){
            manager.addApplication(job);
        }
        

        
        
    }
}
