import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.ROOT);;

        /*
        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
two numbers , takes two numbers as input
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
         */
        System.out.println("please enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("please enter the second number : ");
        int num2 = input.nextInt();
        System.out.println(num1 +" + "+num2 + " = "+ (num1+num2));
        System.out.println(num1 +" - "+num2 + " = "+ (num1-num2));
        System.out.println(num1 +" * "+num2 + " = "+ (num1*num2));
        System.out.println(num1 +" / "+num2 + " = "+ (num1/num2));
        System.out.println(num1 +" mod "+num2 + " = "+ (num1%num2));
                /*
2. Write a Java program that takes a number as input and prints its multiplication table up to
10.
Test Data:
Input a number: 8 Expected
Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
         */
        System.out.println("please enter the number to find the multiplication to 10 :");
        int multiplication_num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplication_num +" * "+i +" = "+ (multiplication_num * i));
        }

                /*
3. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
         */
        System.out.println("Radius = ");
        double Radius = input.nextDouble();
        double Area = Math.PI * (Radius * Radius);
        double Perimeter = Math.PI * 2 * Radius;
        System.out.println("Perimeter is = "+Perimeter);
        System.out.println("Area is = "+Area);

                /*
4. Java program to find out the average of a set of integers
Enter the count of numbers:
5
Enter an integer:
3
Enter an integer:
8
Enter an integer:
6
Enter an integer:
7
Enter an integer:
2
The average is: 5.2
         */
        System.out.println("Enter the count of numbers:");
        double count = input.nextInt();
        double num =0;
        double avg =0;
        for (int j = 0; j < count; j++) {
            System.out.println("Enter an integer: ");
            num = input.nextInt();
            avg +=num;
        }
        System.out.println("The average is: "+avg / count);

                /*
5. Write a Java program that accepts three integers as input, adds the first two integers
together, and then determines whether the sum is equal to the third integer.
3
Sample Output:
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
--------
Input the first number : 10
Input the second number: 20
Input the third number : 25
The result is: false
         */
        System.out.println("Input the first number to find if the sum of first and second = third number : ");
        int number1 = input.nextInt();
        System.out.println("Input the second number to find if the sum of first and second = third number : ");
        int number2 = input.nextInt();
        System.out.println("Input the third number to find if the sum of first and second = third number : ");
        int number3 = input.nextInt();
        if(number1 + number2 == number3){
            System.out.println("The result is: true ");
        }else {
            System.out.println("The result is: false ");
        }

                /*
6. Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
         */
        System.out.println("Input a word: ");
        input.nextLine();
        String word = input.nextLine();
        String new_word="";
        for (int w = 1; w <= word.length(); w++) {
            new_word += word.charAt(word.length() - w );
        }
        System.out.println("The reverse word:  "+new_word);


                /*
7 - Java program to check whether the given number is even or odd
Enter a number:
33
The number is Odd
Enter a number:
24
The number is Even
         */
        System.out.println("Enter a number that you want to know if is ood or even number : ");
        int e_o_num = input.nextInt();
        if(e_o_num % 2 == 1){
            System.out.println("The number is Odd ");
        }else {
            System.out.println("The number is Even ");
        }
                /*
8 - Java program to convert the temperature in Centigrade to Fahrenheit
Enter temperature in Centigrade:
43
Temperature in Fahrenheit is: 109.4
         */
        System.out.println("Enter temperature in Centigrade to covert into Fahrenheit : ");
        double temperature_c = input.nextInt();
        double temperature_f = (temperature_c * 9/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+temperature_f);
                /*
9.Write a Java program that takes a string and a number from the user,then prints the
character in the given index.
Test Data:
Input a string: Java Bootcamp
Input a number: 1
Expected Output:
a
         */

        System.out.println("Input a statement : ");
        input.nextLine();
        String statement = input.nextLine();
        System.out.println("Input a number(index you want to print) in statement: ");
        int index = input.nextInt();
        System.out.println("the character in index "+index+ " in string "+statement+ " is "+statement.charAt(index));

                /*
10. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
         */
        System.out.println("please enter the Width : ");
        double Width =input.nextDouble();
        System.out.println("please enter the Height : ");
        double Height =input.nextDouble();
        double Area_rectangle = Width * Height;
        double Perimeter_rectangle = Width * Height;
        System.out.println("Area is "+Width+" * "+Height+ " = "+Area_rectangle);
        System.out.println("Perimeter is 2 * ("+Width+" + "+Height+") = "+ 2*(Width+Height));

                /*
11. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39
25 <= 39
         */
        System.out.println("Input first integer: ");
        int compare_num1 = input.nextInt();
        System.out.println("Input second integer: ");
        int compare_num2 = input.nextInt();

        if(compare_num1 == compare_num2){
            System.out.println(compare_num1 +" == "+ compare_num2);
        }
        if(compare_num1 != compare_num2){
            System.out.println(compare_num1 +" != "+ compare_num2);
        }
        if(compare_num1 < compare_num2){
            System.out.println(compare_num1 +" < "+ compare_num2);
        }
        if(compare_num1 <= compare_num2){
            System.out.println(compare_num1 +" <= "+ compare_num2);
        }
        if(compare_num1 > compare_num2){
            System.out.println(compare_num1 +" > "+ compare_num2);
        }
        if(compare_num1 >=  compare_num2){
            System.out.println(compare_num1 +" >= "+ compare_num2);
        }



                /*
12. Write a Java program to convert seconds to hours, minutes and seconds.
Sample Output:
Input seconds: 86399
23:59:59
         */
        System.out.println("Input seconds: ");
        int seconds = input.nextInt();
        int mint = seconds / 60;
        int hour = mint / 60;
        int mint_ = seconds % 60;
        double hour_ = mint % 60;
        System.out.println(hour +":"+mint_+":"+hour_);
                /*
13. Write a Java program that accepts four integers from the user and prints equal if all
four are equal, and not equal otherwise.
Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input third number: 23
Numbers are not equal!
         */
        System.out.println("Input first number: ");
        int num1_equal = input.nextInt();
        System.out.println("Input second number: ");
        int num2_equal = input.nextInt();
        System.out.println("Input third number: ");
        int num3_equal = input.nextInt();
        System.out.println("Input fourth number: ");
        int num4_equal = input.nextInt();
        if (num1_equal == num2_equal && num1_equal==num3_equal && num1_equal == num4_equal){
            System.out.println("Numbers are equal! ");
        }else {
            System.out.println("Numbers are not equal! ");
        }
                        /*
14. Write a Java program that reads an integer and check whether it is negative, zero, or
positive.
Test Data Input a number: 7 Expected Output :
Number is positive
         */
        System.out.println("please Input a number: ");
        int n_z_p_num = input.nextInt();
        if(n_z_p_num > 0){
            System.out.println("Number is positive ");
        } else if (n_z_p_num < 0) {
            System.out.println("Number is Negative ");
        } else{
            System.out.println("Number is zero ");
        }

                        /*
15.Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered (End loop use -1 ,
Don’t count -1).
Test data
1
3
0
-2
-4
-1
2 positives
1 zero
2 negatives
         */
        int numbers ;
        int count_pos=0;
        int count_neg=0;
        int count_zero=0;
        do {
            System.out.println("please enter the numbers and -1 to stop");
            numbers = input.nextInt();
            if(numbers > 0){
                count_pos++ ;
            }else if(numbers < 0 && numbers !=-1){
                count_neg++;
            }else if(numbers == 0){
                count_zero++;
            }
        }while(numbers != -1);
        System.out.println("the count of positives is : "+count_pos);
        System.out.println("the count of negative is : "+count_neg);
        System.out.println("the count of zero is : "+count_zero);

                        /*
16 - Write a program that prompts the user to input an integer and then outputs the
number with the digits reversed.
For example, if the input is 12345, the output should be 54321.
         */
        System.out.println("please enter the number to reversed : ");
        int num_revers = input.nextInt();
        String num_reversed =  String.valueOf(num_revers);
        System.out.println(num_reversed);
        String num_word="";
        for (int r = 1; r <= num_reversed.length(); r++) {
            num_word += num_reversed.charAt(num_reversed.length() - r );
        }
        System.out.println(num_word);

                        /*
17 - Write a program to enter the numbers till the user wants and at the end the
program should display the largest and smallest numbers entered.
enter the number : 4
enter the number : 5
enter the number : -1
enter the number : 9
the large number : 9
the small number : -1
         */
        int numbers_larg_small ;
        int smallest=0;
        int largest=0;
        do {
            System.out.println("please enter the numbers and 0 to stop");
            numbers_larg_small = input.nextInt();
            if(numbers_larg_small > largest){
                largest = numbers_larg_small ;
            }else if(numbers_larg_small < smallest){
                smallest = numbers_larg_small;
            }
        }while(numbers_larg_small != 0);
        System.out.println("the largest is : "+largest);
        System.out.println("the smallest is : "+smallest);

                        /*
18 - Determine and print the number of times the character ‘a’ appears in the input
entered by the user.
Enter String:
Java bootcamp
Output: Number of a's: 3
         */
        System.out.println("Enter String: ");
        input.nextLine();
        String character_a = input.nextLine();
        int count_a =0;
        for (int i = 0; i < character_a.length(); i++) {
            if (character_a.charAt(i)=='a'){
                count_a++;
            }
        }
        System.out.println("Output: Number of a's: "+count_a);

    }
}