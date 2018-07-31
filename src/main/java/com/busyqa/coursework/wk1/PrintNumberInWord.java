package com.busyqa.coursework.wk1;

public class PrintNumberInWord {
    public static void main(String[] args) {
        int number = 5;  // Set the value of "number" here!

        // Using nested-if
//        if (number == 1) {
//            System.out.println(number + ":One");
//       } else if ( number==2 ) {
//         System.out.println(number + ":Two");
//        } else if ( number==3 ) {
//            System.out.println(number + ":Three");
//        } else if(number ==4){
//            System.out.println(number + ":Four");
//        } else if(number ==5){
//            System.out.println(number + ":Five");
//
////         ......
//       } else {
//            System.out.println(number + ": is not defined yet");
//        }
////        }

        // Using switch-case
        switch(number) {
            case 1: System.out.println(number + ": One" ); break;  // Don't forget "break"
            case 2: System.out.println( number + ":Two"); break;
            case 3: System.out.println( number + ":Three"); break;
            case 4: System.out.println( number + ":Four"); break;
            case 5: System.out.println( number + ":Five"); break;
            case 6: System.out.println( number + ":Six"); break;

            default: System.out.println(number + ": is not defined yet" );
        }
    }
}
