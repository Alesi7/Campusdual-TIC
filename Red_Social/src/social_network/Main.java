package social_network;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main{

public Main(final String[] args) {
	addF();
}

private static void addF() {
// TODO Auto-generated method stub
	
}

//lista de users
public static <User> void Main1(String[] args){
	List<User>usersList =  new ArrayList<>();
	user Pepe = new user("Pepe");
	user Manolita = new user("Manolita");
	user Juan = new user("Juan");
	user Julia = new user("Julia");
	user Sandra = new user("Sandra");
	user Diego = new user("Diego");
	user Carlos = new user("Carlos");
	
	List<user> followedPepe = new ArrayList<>();
	followedPepe.add(Manolita);
	followedPepe.add(Diego);
	
	List<user> followedManolita = new ArrayList<>();
	followedManolita.add(Juan);
	followedManolita.add(Diego);
	
	ImagePost imagpepe = new ImagePost(LocalDate.of(2022, 5, 4),new ArrayList<comment>(), "Selfie.jpg", 400, 450);
	Post textpepe = new TextPost(LocalDate.of(2022, 4, 1), new ArrayList<comment>(), "Hoy salí de acampada");
	List<Post> Postlistpepe = new ArrayList<>();
	Postlistpepe.add(imagpepe);
	Postlistpepe.add(textpepe);
	
	comment commenttextpepediego = new comment("Menuda suerte", LocalDate.of(2022,  4, 2), Diego);
	comment commenttextpepemanolita = new comment("Espero que no lloviese", LocalDate.of(2022, 4, 2),Manolita);
	List<comment>commentlist = new ArrayList<>();
	commentlist.add(commenttextpepemanolita);
	commentlist.add(commenttextpepediego);
	
			textpepe.setcommentlist(commentlist);
//añadimos la lista de Post a pepe
			Pepe.setListPost(Postlistpepe);
//añadimos amigos de pepe a pepe
			Pepe.setfollowedlist(followedPepe);
//añadimos amigos de manolita a manolita
			Manolita.setfollowedlist(followedManolita);
			
//añadimos los usuarios a la lista de usuarios de la red social
			usersList.add((User) Diego);
			usersList.add((User) Carlos);
			usersList.add((User) Pepe);
			usersList.add((User) Manolita);
			usersList.add((User) Julia);
			usersList.add((User) Sandra);
			usersList.add((User) Juan);
}

}