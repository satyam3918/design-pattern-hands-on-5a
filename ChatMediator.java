import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> users;

	public ChatMediator() {
		users = new ArrayList<IUser>();
	}

	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void SendMessage(String message) {
		users.forEach(u -> u.RecieveMessage(message));
	}

}
