
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("welcome to personnel program");
        String operations = "operations\n"
                + "1)developer operations\n"
                + "2)manager operations\n"
                + "enter for quit (q)";
        System.out.println("*************************************************");
        System.out.println(operations);
        System.out.println("*************************************************");
        while(true){
            System.out.println("select operation:");
            String operation =scn.nextLine();
            if(operation.equals("q")){
                System.out.println("log out");
                break;
            }
            else if(operation.equals("1")){
                Developer dev1 = new Developer("@hllbr", "@pirnce", 558, "python,C,C++,JAVA,Kotlin");
                String operationString = "1)format\n"
                        + "2)show data\n"
                        + "quit for (q)";
                System.out.println(operationString);
                while (true) {   
                    System.out.println("select from developer operations");
                    String d_operation = scn.nextLine();
                    if(d_operation.equals("q")){
                        System.out.println("log out from developer operations");
                        break;
                    }
                    else if(d_operation.equals("1")){
                        System.out.println("operating system :");
                        String os =scn.nextLine();
                        dev1.format(os);
                    }else if(d_operation.equals("2")){
                        dev1.showData();
                    }else{
                        System.out.println("invalid developer action");
                    }
                    
                }
            }
            else if(operation.equals("2")){
                manager man1 = new manager("@prince", "@hllbr", 855, 1000);
                String manager_operations = "manager operations\n"
                        + "1)make a raise\n"
                        + "2)show data\n"
                        + "enter for log out from manager operations q) ";
                System.out.println("*************************************************");
                System.out.println(manager_operations);
                System.out.println("*************************************************");
                while (true) {
                    System.out.println("select operation : ");
                    String m_operation = scn.nextLine();
                    if(m_operation.equals("q")){
                        System.out.println("log out from manager operation");
                        break;
                    }else if(m_operation.equals("1")){
                        System.out.println("how much raise do you want ? ...");
                        int amao_unt = scn.nextInt();
                        scn.nextLine();
                        man1.rise_in_salary(amao_unt);
                    }else if(m_operation.equals("2")){
                        man1.showData();
                    }else{
                        System.out.println("invalid admin action");
                    }
                   
                    
                }

            }else{
                System.out.println("invalid operation");
                
            }
        }

    }
    
}
