public class Test {
	public static void main(String[] args){
		TestUserDAO dao = new TestUserDAO();
		System.out.println("---------------------");
		dao.select("taro","123");

		System.out.println("----------ALL-----------");
		dao.selectAll();

		System.out.println("----------Name-----------");
		dao.selectByName("taro");

		System.out.println("----------Password-----------");
		dao.selectByPassword("123");

		System.out.println("----------UPDATE-----------");
		dao.updateUserNameByUserName("taro", "saburo");

		System.out.println("----------INSERT-----------");
		dao.insert(4, "shiro", "012");

		System.out.println("----------DELETE-----------");
		dao.deletet("shiro");

	}
}
