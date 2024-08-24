public class TestFour {
    public static void main(String[] args) {

        for(int i = 1; i <= 9; i++) {
//            for(int j = 1; j <= 9; j++) {
//
//            }
            for(int j = 1; j <= 11; j++){

                if(i == 1 && j == 5){
                    System.out.print(" *");
                }else if(i == 2 && j == 4 || i == 2 && j ==6){
                    System.out.print(" * ");
                } else if(i == 3 && j == 3 || i == 3 && j == 7) {
                    System.out.print(" * ");
                }else if(i == 4 && j == 2 || i == 4 && j == 8) {
                    System.out.print(" * ");
                }else if(i == 5 && j == 1 || i == 5 && j == 9) {
                    System.out.print(" * ");
                } else if (i==6 ) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}
