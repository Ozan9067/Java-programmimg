package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {

        String message = "Sender: [ saim ] from number <9889898989> Message:{Hello, lets do some coding}";

        int start = message.indexOf("[");
        int end = message.indexOf(']');
        //message.substring(start,end);

        System.out.println(message.substring(start+1,end));

        String sender = message.substring(start+1,end);



        System.out.println("sender = " + sender);


        String mobile = message.substring( message.indexOf("<")+1,message.indexOf(">") );
        System.out.println(mobile);

        String text = message.substring( message.indexOf("{")+1,message.indexOf("}") );
        System.out.println("text = " + text);





        System.out.println("  fikret ".trim());

        //sender = sender.trim();
        System.out.println(sender);

        if (sender.equals("saim")){
            System.out.println("message from saim about homework");
        }else {
            System.out.println("someone elses message");
        }



    }
}
