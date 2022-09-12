package social_network;

import java.util.ArrayList;
import java.util.List;

import social_network.User2.user;

private static final ArrayList<comment> ArrayList = null;
protected String name;
protected String User;
public List<user>Userslist1;
public static String post;
protected static String input1;
public user(String name){
public class User{
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Post> getPostList() {
		return postList;
	}
	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
	public List<User2> getFriendList() {
		return friendList;
	}
	public void setFriendList(List<User2> friendList) {
		this.friendList = friendList;
	}
	
	
	private String userName;
	private List<Post> postList;
	private List<User2> friendList;

	//Constructores
	public User(String userName) {
		this.userName=userName;
		this.friendList=new ArrayList<User2>();
		this.postList=new ArrayList<Post>();
	}
	public User(String userName,List friendList,List postList) {
		this.userName=userName;
		this.friendList= ArrayList<User>(friendList);
		this.postList= ArrayList<Post>(postList);
	}

	