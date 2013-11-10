package game;
public class Question 
{
	private int questionNum = 0;
	private String question;
	protected int getQuestionNum() {
		return questionNum;
	}

	protected String getQuestion() {
		return question;
	}

	private String answer;
	boolean isAnswered = false;
	boolean isTried = false;
	
	public Question(int qNum, String q, String a) {
		super();
		this.questionNum = qNum;
		this.question = q;
		this.answer = a;
	}
	
	boolean attemptAnswer(String a){
		isTried = true;
		if(a.equals(answer)){
			isAnswered = true;
			return true;
		}
		else{
			return false;
		}
	}
}
