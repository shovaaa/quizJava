package Quiz;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Registration {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    static int select, option, count = 0;
    static char choose;
    static String answer, subject;

    public static void con() throws SQLException {
        Connection con = null;
        con = DbConnect.getDbConnect();
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your email address:");
        String email_address = sc.next();
        Statement mt = con.createStatement();
        mt.executeUpdate("insert into player (name, email_address) values("+"'"+name+"','"+email_address+"')");
    }

    public static void intro() throws SQLException {
        System.out.println("\t\tWELCOME TO THE QUIZ");
        System.out.println("1. Register to play the quiz (type 1)");
        System.out.println("2. Already registered? (type 2)");
        System.out.println();
        System.out.println("Enter your choice:");
        select = sc.nextInt();
        switch (select){
            case 1:
                con();
                break;
            case 2:
                Connection con = null;
                con = DbConnect.getDbConnect();
                System.out.println("Enter your email address");
                String name = sc.next();
                Statement mt = con.createStatement();
                ResultSet rs = mt.executeQuery("select marks from player where name = '"+name+"'");
            System.out.println("Your highscore is: "+ rs.getInt("marks"));
                break;
        }
        play();
    }

    public static void science() throws SQLException {
        Connection con = null;
        con = DbConnect.getDbConnect();
        Statement mt = con.createStatement();

        ResultSet rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'science' and ques_id = 1");

        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();
            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'science' and ques_id = 2");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));

            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'science' and ques_id = 3");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));

            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'science' and ques_id = 4");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));

            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'science' and ques_id = 5");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));

            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        System.out.println("Your score = " + count);
        highScore();
    }

    public static void history() throws SQLException {
        Connection con = null;
        con = DbConnect.getDbConnect();
        Statement mt = con.createStatement();
        ResultSet rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'history' and ques_id = 1");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));

            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'history' and ques_id = 2");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'history' and ques_id = 3");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'history' and ques_id = 4");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'history' and ques_id = 5");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        System.out.println("Your score = " + count);
        highScore();
    }

    public static void geography() throws SQLException {
        Connection con = null;
        con = DbConnect.getDbConnect();
        Statement mt = con.createStatement();

        ResultSet rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'geography' and ques_id = 1");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'geography' and ques_id = 2");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'geography' and ques_id = 3");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'geography' and ques_id = 4");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'geography' and ques_id = 5");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        System.out.println("Your score = " + count);
        highScore();
    }

    public static void gk() throws SQLException {
        Connection con = null;
        con = DbConnect.getDbConnect();
        Statement mt = con.createStatement();
        ResultSet rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'gk' and ques_id = 1");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'gk' and ques_id = 2");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'gk' and ques_id = 3");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'gk' and ques_id = 4");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        rs = mt.executeQuery("Select ques_id, question, ans1, ans2, ans3, ans4, rigth_ans " +
                "from ques_ans where subject = 'gk' and ques_id = 5");
        while(rs.next()){
            System.out.println(rs.getInt("ques_id")+"\t"+rs.getString("question"));
            System.out.println(rs.getString("ans1")+ "\t"+ rs.getString("ans2")+ "\t"
                    + rs.getString("ans3") + "\t"+ rs.getString("ans4"));
            System.out.println("Answer:");
            answer = sc.next();

            if(answer.equals(rs.getString("rigth_ans"))) {
                count++;
            }
        }

        System.out.println("Your score = " + count);
        highScore();
    }

    public static void play() throws SQLException {
        System.out.println("Select the subject");
        System.out.println("1. Science (to select science type 1)");
        System.out.println("2. History (to select history type 2)");
        System.out.println("3. Geography (to select geography type 3)");
        System.out.println("4. G.K (to select gk type 4)");
        System.out.println();
        System.out.println("Enter your choice");
        option = sc.nextInt();
        highScore();
        System.out.println("Please enter Answer: a or b or c or d");
        switch (option){
            case 1:
                science();
                break;
            case 2:
                history();
                break;
            case 3:
                geography();
                break;
            case 4:
                gk();
                break;
        }
        again();
    }

    public static void highScore() throws SQLException {
        Connection con = null;
        con = DbConnect.getDbConnect();
        Statement mt = con.createStatement();
        mt.executeUpdate("insert into player (marks) values ("+"'"+count+"'"+")");
        System.out.println("High score = "+count);
    }

    public static void again() throws SQLException {
        System.out.println("Do you want to play again? (y/n)");
        choose = sc.next().charAt(0);

        switch (choose){
        case 'y':
            play();
            break;
        case 'Y':
            play();
            break;
        case 'N':
            System.out.println("Your total score = "+count);
            System.out.println("Thank You!");
            break;
        case 'n':
            System.out.println("Your total score = "+count);
            System.out.println("Thank You!");
            break;
            default:
                System.out.println("Enter the correct choice");
                again();
        }
    }

    public static void main(String [] args) throws SQLException {
        intro();
    }
}
