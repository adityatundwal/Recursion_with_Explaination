package RecursionPractice;

public class subseq {
    public static void main(String[] args) {
        String s = "ABC";
        Printseq(s,"");
    }

    private static void Printseq(String ques, String ans) {
        if(ques.length()==0){
            System.out.println(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        Printseq(ques.substring(1), ans);
        Printseq(ques.substring(1),ans+ch);
    }
    
}
