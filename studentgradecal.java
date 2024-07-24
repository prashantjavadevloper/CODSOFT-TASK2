//WRITE A PROGRAM TO MAKE STUDENT GRADE CALCULATOR ACCORDING TO THE GIVEN CONDITIONS.
/*Input: Take marks obtained (out of 100) in each subject.
  Calculate Total Marks: Sum up the marks obtained in all subjects.
  Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
  Grade Calculation: Assign grades based on the average percentage achieved.
  Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
*/
import java.util.Scanner;//IMPORT SCANNER CLASS
//MAKE A CLASS AND ASSIGN ITS NAME
class studentgradecal 
//OPENING OF CLASS
{
    //EXECUTION START OF PROGRAM FROM THE MAIN METHOD
    public static void main(String arg[]) 
    //OPENING OF MAIN METHOD BRACKET
    {
        System.out.println("_________________________________________");  //DISPLAYING THE UNDERSCORE
        System.out.println("STUDENT GRADE CALCULATOR");                  //DISPLAYING THE CODE NAME
        System.out.println("_________________________________________");//DISPLAYING THE UNDERSCORE
        int totalmarks, subject, sumofmarks = 0;                       //INITIALIZE THE VARIABLE WITH DATATYPE
        float avgpercent = 0.0f;                                      //INITIALIZE THE VARIABLE WITH DATATYPE
        Scanner sc = new Scanner(System.in);                         //CALL SYSTEM CLASS IN SCANNER
        System.out.print("HOW MANY SUBJECT YOU HAVE=");             //PRINT INSTRUCTION 
        subject = sc.nextInt();                                    //VALUE ASSIGN TO THE VARIABLE subject
        //BEGNING OF 'FOR' LOOP
        for (int i = 1; i <= subject; i++) 
        //OPEPNING OF 'FOR' LOOP BRACKET
        {
            System.out.print("ENTER THE MARK OF " + i + " SUBJECT= "); //PRINT THE MARKS OF SUBJECT
            totalmarks = sc.nextInt();                                //VALUE ASSIGN TO THE VARIABLE totalmarks
            sumofmarks += totalmarks;                                //CALCULATE THE sumofmarks
            System.out.println("TOTAL MARKS= " + sumofmarks);       //PRINT TOTAL MARKS OF SUBJECT
        }//CLOSEING OF 'FOR' LOOP BRACKET
        avgpercent = sumofmarks / subject;                                  //CALCULATE THE AVERAGE PERCENTAGE
        System.out.println("AVERAGE PERCENTAGE= " + avgpercent); //PRINT THE AVERAGE PERCENTAGE
        //'IF' CONDITION 
        if (avgpercent >= 90) 
        //OPENING OF 'IF' CONDITION BRACKET
        {
            System.out.println("A1 GRADE");
        } //CLOSEING OF 'IF' CONDITION BRACKET
         //'ELSE IF' CONDITION
        else if (avgpercent >= 80) 
        //OPENING OF 'IF' CONDITION BRACKET
        {
            System.out.println("A2 GRADE");
        } //CLOSEING OF 'ELSE IF' CONDITION BRACKET
         //'ELSE IF' CONDITION
        else if (avgpercent >= 70) 
        //OPENING OF 'IF' CONDITION BRACKET
        {
            System.out.println("B1 GRADE");
        } //CLOSEING OF 'ELSE IF' CONDITION BRACKET
         //'ELSE IF' CONDITION
        else if (avgpercent >= 60) 
        //OPENING OF 'ELSE IF' CONDITION BRACKET
        {
            System.out.println("B2 GRADE");
        } //CLOSEING OF 'ELSE IF' CONDITION BRACKET
         //'ELSE IF' CONDITION
        else if (avgpercent >= 50) 
        //OPENING OF 'ELSE IF' CONDITION BRACKET
        {
            System.out.println("C1 GRADE");
        } //CLOSEING OF 'ELSE IF' CONDITION BRACKET
         //'ELSE IF' CONDITION
        else if (avgpercent >= 40 ) 
        //OPENING OF 'ELSE IF' CONDITION BRACKET
        {
            System.out.println("C2 GRADE");
        } //CLOSEING OF 'ELSE IF' CONDITION BRACKET
         //'ELSE IF' CONDITION
        else if (avgpercent >= 33) 
        //OPENING OF 'ELSE IF' CONDITION BRACKET
        {
            System.out.println("D1 GRADE");
        } //CLOSEING OF 'ELSE IF' CONDITION BRACKET
         //'ELSE IF' CONDITION
        else if(avgpercent < 33)
        //OPENING OF 'ELSE IF' CONDITION BRACKET
        {
            System.out.println("FAIL");
        } //CLOSEING OF 'ELSE IF' CONDITION BRACKET
         //'ELSE' CONDITION
        else 
        //OPENING OF 'ELSE' CONDITION BRACKET
        {
            System.out.println("NOT VALID FOR FOR MARKS");
        } //CLOSEING OF 'ELSE' CONDITION BRACKET
    }
}