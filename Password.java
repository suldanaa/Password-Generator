import java.util.ArrayList;
import java.util.Random;
public class Password {
    public static void main(String[] args) {
        Random rand = new Random();

        //CONSTRAINTS:
        //Digits = { 0-9 }
        //Letters = { a-z }
        //Special characters = { *, &, $, # }
        //Length of 8
        //First Char must be a number

        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] special = {"*","&","$","#"};
        int possiblePass = digits.length + letters.length + special.length;

        //EQT: (restraint)*(total)^length-1
        System.out.println("There are " + (long)(digits.length*Math.pow(possiblePass,7)) + " possible passwords given the constraints given.");

        int upperboundD = 10;
        int upperboundL = 26;
        int upperboundS = 4;

        int randomD = rand.nextInt(upperboundD);
        int randomL;
        int randomS;

        ArrayList<String> Password = new ArrayList<>();

        Password.add(digits[randomD]);

        while(Password.size()<8){

             randomD = rand.nextInt(upperboundD);
             randomL = rand.nextInt(upperboundL);
             randomS = rand.nextInt(upperboundS);

            int random = rand.nextInt(100);

            if(random<50) {
                Password.add(letters[randomL]);
            } else if (random>50){
                Password.add(special[randomS]);
            } else {
                Password.add(digits[randomD]);
            }

        }

        System.out.print("Your randomized password is: ");
        for(int x=0; x<Password.size(); x++){
            System.out.print(Password.get(x));
        }

    }
}
