package com.manny;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            // Important to have a break after every case, r else you'll get unpredictable results

            case 2:
                System.out.println("Value was 2");
                break;

            // Grouping multiple test cases together on one line which makes it a lot easier
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }
        // The "if-statement" is more flexible in that each time we do a test inside the parenthesis
        // we don't have to use the same test criteria we used initially (i.e. We can use a different variable
        // and value altogether in the "else-if statement")
        //Example:
        // if(value == 1) {
        //    System.out.println("Value was 1");
        //    }else if(value == 2){
        //    System.out.println("Value was 2");
        //    }
        //
        // In the case of the switch statement, we're testing only the switch value, and we're testing different
        // values for that same value.
        // So. we can't actually introduce a different variable type to test for arguments sake.
        // We just have the one variable in the switch statement
        //
        // Switch is good to use if you're actually testing the same variable and you want to test different values
        // for that variable.
        // In situations where you had 20 values, to test for the Switch statement could get a little tedious
        // There is a shortcut (see above)
        //
        //Challenge!
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a new switch statement testing for:
        // A, B, C, D or E
        // Display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'F';

        switch(charValue){
            case 'A':
                System.out.println("char value is A");
                break;

            case 'B':
                System.out.println("char value is B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("char value is " + charValue);
                break;

            default:
                System.out.println("No values match");
                break;
        }

        String month = "DECEMBEr";
        switch(month.toLowerCase()){
            // .toLowerCase() is a method that is a part of Java attached to the String class
            // which enables us to perform some functionality by converting the entire String value to lowercase
            case "january":
                System.out.println("Jan");
                break;
            case "december":
                System.out.println("Dec");
                break;
            default:
                System.out.println("Not sure");
                break;
            // The switch statement is very common to use and very versatile
        }
    }
}
