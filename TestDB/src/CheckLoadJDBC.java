public class CheckLoadJDBC {

	public static void main(String[] args) throws
	InstantiationException,IllegalAccessException{
		String msg = "";

		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg = "ドライバのロードの成功しました。";
		}catch(ClassNotFoundException e){
			msg = "ドライバのロードに失敗しました。";
		}
		System.out.println(msg);
	}
}
