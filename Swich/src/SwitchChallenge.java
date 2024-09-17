public class SwitchChallenge {
    public static void main(String[] args){
        char letter = 'C';

        System.out.println(switchReturn(letter));

    }

    public static String switchReturn(char letter){

        return switch (letter){
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "bad";

        };

    }

    public static String switchReturnLegacy(char letter){

        switch (letter) {
            case 'A':
                return "Able";
            default:
                return "bad";
        }

    }

}
