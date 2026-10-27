package D7;
import java.util.*;
import java.io.IOException;
import java.nio.file.*;

public class FileStorage {
    private Path path = Path.of("applications.txt");
    public void saveToFile(List<JobApplication> jobs){
        StringBuilder message = new StringBuilder();
        for(JobApplication job:jobs){
            
            message.append(job.getId()+",");
            message.append(job.getCompany()+",");
            message.append(job.getPosition()+",");
            message.append(job.getStatus());
            message.append("\n");
        }
        try{
            Files.writeString(path, message.toString());
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
    public List<JobApplication> loadFromFile(){
        List<JobApplication> jobs = new ArrayList<>();
        if (!Files.exists(path)){
            return jobs;
        }
        try {
            List<String> lines = Files.readAllLines(path);
            for(String line:lines){
                String[] parts=line.split(",");
                JobApplication job = new JobApplication(Integer.parseInt(parts[0]),parts[1],parts[2],parts[3]);
                jobs.add(job);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return jobs;
        
    }
}
