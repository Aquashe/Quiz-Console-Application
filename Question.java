
public class Question {
    private int id;
    private String que;
    private String opt[];
    private String ans;

    public Question(int id, String que, String[] opt, String ans) {
        this.id = id;
        this.que = que;
        this.opt = opt;
        this.ans = ans;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQue() {
        return que;
    }
    public void setQue(String que) {
        this.que = que;
    }

    public String getAns() {
        return ans;
    }
    public void setAns(String ans) {
        this.ans = ans;
    }
    public String[] getOpt() {
        return opt;
    }
    public void setOpt(String[] opt) {
        this.opt = opt;
    }

}
