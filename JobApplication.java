package D7;

import java.util.*;

public class JobApplication {
    private int id;
    private String company;
    private String position;
    private String status;
    

    public JobApplication(int id,String company, String position,String status){
        this.id=id;
        this.company=company;
        this.position=position;
        this.status=status;
    }
    
    public void setStatus(String status){
        this.status=status;
    }
    public int getId(){
        return id;
    }
    public String getCompany(){
        return company;
    }
    public String getPosition(){
        return position;
    }
    public String getStatus(){
        return status;
    }
    @Override
    public String toString() {
        
        return "ID:"+id+",Company:"+company+",Position:"+position+",Status:"+status;
    }
}
