
public class Developer extends Calısan{//here is sub class
    private String languages ;
    

    public Developer(String name, String surname, int id,String languages) {
        super(name, surname, id);
        this.languages = languages ;
    }
    public void format(String operating_system){
        System.out.println(getName() + " " + operating_system +" loading...");
    }

    @Override
    public void showData() {
        super.showData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("languages of developer ; " +languages);
    }
    
    
}
