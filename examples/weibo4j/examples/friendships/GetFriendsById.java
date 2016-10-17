package weibo4j.examples.friendships;

import weibo4j.Friendships;
import weibo4j.model.User;
import weibo4j.model.UserWapper;
import weibo4j.model.WeiboException;

public class GetFriendsById {

	public static void main(String[] args) {
		String access_token = "2.004DezPC6P3DdD00518038e19iDRoD";
		String id = "2068602681";
		Friendships fm = new Friendships(access_token);
		try {
			UserWapper users = fm.getFriendsByID(id);
			int i = 0;
			System.out.println("heheda " + users.getUsers().size());
			for(User u : users.getUsers()){
				System.out.println(u.toString());
				i++;
			}
			System.out.println("dq : count = " + i);
			System.out.println(users.getNextCursor());
			System.out.println(users.getPreviousCursor());
			System.out.println(users.getTotalNumber());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
