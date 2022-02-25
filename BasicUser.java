
public class BasicUser implements IUser {

	private ChatMediator chatMediator;
	private String name;

	public BasicUser(ChatMediator chatMediator,String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}

	@Override
	public void RecieveMessage(String message) {
		System.out.println(name + ": " + message);
	}

	@Override
	public void SendMessage(String message) {
		chatMediator.SendMessage(message);
	}

}
