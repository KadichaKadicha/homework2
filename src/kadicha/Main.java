package kadicha;

public class Main {

    public static void main(String[] args) {


        String name = "Rose";
        int age = 43;
        int temperature = 29;
        if ((temperature > 30 || temperature < -20) &&(age>20||age<45)) {
            System.out.println(name+" "+" не выходит гулять");
        } else{
            System.out.println(name+" "+" отправляется в гости к своему другу");
        }

        if((age<20)&&(temperature<28||temperature>0)) {
            System.out.println(name+" "+" не выходит гулять");
        } else{
            System.out.println(name+" "+" отправляется в гости к своему другу");
        }

        if((age>45)&&(temperature>10||temperature<25)){
            System.out.println(name+" "+" не выходит гулять");
        }else{
            System.out.println(name+" "+"отправляется в гости к своему другу");
        }

        }



    }




