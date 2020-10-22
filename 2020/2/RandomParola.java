public class RandomParola {
    public static void main(String[] args) {

        String input = "ciao";

        while (input.length() > 0) {
            String newString = "";
            for (int i = 0; i < input.length(); i++) {

                double randomDouble = Math.random() * input.length();
                int randomInt = (int) randomDouble;
                if (i == randomInt) {
                    System.out.println(input.charAt(randomInt));
                } else {
                    newString += input.charAt(i);
                }

            }
            input = newString;

        }

    }
}
