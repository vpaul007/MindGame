package MindGame;

public class testing1111 {
	public  int process(int number,  boolean assertion, float value){
        if(number >= -1 || value <= 0.01f)return 0;
        if(!assertion && (number < 10 || value >0)){
            return 1;
        }else if (number > 10  || value <= 10.00001f){
            return 2;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        testing1111 e = new testing1111();
        int result = e.process(-2, !true, 1.001f);
        System.out.println(result);
    }
}

