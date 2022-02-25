
public class Client {

	public static void main(String[] args) {

		ChatMediator chatMediator = new ChatMediator();
		IUser basic = new BasicUser(chatMediator, "Saptak");
		IUser premium = new PremiumUser(chatMediator, "Das");
		chatMediator.AddUser(basic);
		chatMediator.AddUser(premium);
		IUser source = new PremiumUser(chatMediator, "Broadcast");
		source.SendMessage("Hello and welcome to chat room!");

	}

}
