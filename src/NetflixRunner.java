//1. Instantiate some Movie objects (at least 5).
	//2. Use the Movie class to get the ticket price of one of your movies.

	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 

public class NetflixRunner {
public static void main(String[] args) {
	Movie m1 = new Movie("Harry Potter 1", 4);
	
	Movie m2 = new Movie("Hary Potter 2", 3);
	
	Movie m3 = new Movie("Harry Potter 3", 2);
	
	Movie m4= new Movie("Harry Potter 4", 1);
	
	Movie m5 = new Movie("Harry Potter 5", 5);
	
	m5.getTicketPrice();
	
	NetflixQueue fido = new NetflixQueue();
	
	
	fido.addMovie(m1);
	fido.addMovie(m2);
fido.addMovie(m3);
fido.addMovie(m4);
fido.addMovie(m5);


}
}
