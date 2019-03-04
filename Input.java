package LineSegment;
import java.io.*;
/**
 * キーボードからの入力を行うためのクラス
 * @author Matsuura Saeko
 * @version 1.0
 */
public class Input{
    private String prompt;
    private final String ERROR_INPUT_DOUBLE = "入力値は実数ではありません。";
    private final String ERROR_INPUT = "エラー：入力に誤りがあります。";
    
    private void setPrompt(String prompt){
	this.prompt = prompt;
    }
    private String input() throws IOException{
	String line;
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	line = reader.readLine();
	return line;
    }
    /**
     * 実数の入力
     * 引数で与えられたメッセージを出力後、キーボードから入力された文字列を実数として返すメ
     ソッドである。入力された文字列が実数として解釈できない場合には、再入力を促す。
     このメソッドを利用して、キーボードから実数を入力する。
     * @param String prompt :入力を促すメッセージ
     * @exception Exception : 入力値が実数として解釈できない場合の例外を処理する
     */
    public double inputDouble(String prompt){
	this.setPrompt(prompt);
	System.out.println(this.prompt);
	try{
	    String value = this.input();
	    double n = Double.parseDouble(value);
	    return n;
	} catch (Exception s){
	    System.out.println(ERROR_INPUT_DOUBLE);
	    return this.inputDouble(prompt);
	}
    }
    /**
     * 文字列の入力
     * 引数で与えられたメッセージを出力後、キーボードから入力された文字列を返すメソッドであ
     る。入力における例外は発生した場合には再入力を促す。
     * @param String prompt :入力を促すメッセージ
     * @exception Exception : 入力が失敗した場合の例外を処理する
     */
    public String inputString(String prompt){
	this.setPrompt(prompt);
	System.out.println(this.prompt);
	try{
	    String n = this.input();
	    return n;
	}
	catch (Exception s){
	    System.out.println(ERROR_INPUT);
	    return this.inputString(prompt);
	}
    }
}
