public class LearnGitHub
{
 private String name;
 private String purpose;
 
 public LearnGitHub(String name, String purpose){
 this.name=name;
 this.purpose=purpose;
 }
 
 public String getName(){
 return this.name;
 } 
 public String getPurpose(){
 return this.purpose;
 }


}
class Main{
public static void main (String[] args){
  LearnGitHub learnGitHub=new LearnGitHub("beran santur","learning github which seems a bit confusing");
  System.out.println("Name = "+learnGitHub.getName()+" purpose = "+learnGitHub.getPurpose());
  System.out.println("Creating a new branch");
}
 



}
