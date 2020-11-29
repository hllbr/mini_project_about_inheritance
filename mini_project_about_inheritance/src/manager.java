
public class manager extends Calısan{//here is sub class
    private int number_of_people_responsible ;

    public manager(String name, String surname, int id,int number_of_people_responsible) {
        super(name, surname, id);
        this.number_of_people_responsible = number_of_people_responsible;
    }

    @Override
    public void showData() {
        super.showData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("number_of_people_responsible of manager : " +number_of_people_responsible);
    }
    public void rise_in_salary(int amount){
        System.out.println(getName()+ " personnel " +amount+ "raised");
    }
    
    
}
