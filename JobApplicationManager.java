package D7;

import java.util.*;

public class JobApplicationManager {
    private HashMap<Integer,JobApplication> applications=new HashMap<>();

    public void addApplication(JobApplication job){
        
        if(!applications.containsKey(job.getId())){
            applications.put(job.getId(),job);
        }
        else{
            throw new IllegalArgumentException("Application ID already exists");
        }
        System.out.println("Application added successfully");
            
        
    }
    public JobApplication getApplication(int id){
        if (!applications.containsKey(id)){
            throw new IllegalArgumentException("Null");
        }
        return applications.get(id);
    }

    public void removeApplication(int id){
        if(!applications.containsKey(id)){
            throw new IllegalArgumentException("Application not found");
        } else{
            applications.remove(id);
            System.out.println("Application removed successfully");
        }
    }
    public void updateStatus(int id,String newStatus){
        if(!applications.containsKey(id)){
            throw new IllegalArgumentException("Application not found");
        }
        applications.get(id).setStatus(newStatus);
        System.out.println("Application status updated successfully");
    }

    public List<JobApplication> getAllApplications(){
        List<JobApplication> jobs = new ArrayList<>(applications.values());
        return jobs;
    }

}
