
public class NetflixRunner {
	public static void main(String[] args) {
		Movie TrainToBusan = new Movie("Train To Busan", 10, 119);
		Movie Avatar = new Movie("Avatar", 10, 142);
		Movie PacificRim = new Movie("Pacific Rim", 10, 120);
		Movie Deadpool = new Movie("Deadpool", 10, 120);
		Movie IT = new Movie("IT", 1, 100);
		
		String price = TrainToBusan.getTicketPrice();
		String price1 = Avatar.getTicketPrice();
		String price2 = PacificRim.getTicketPrice();
		String price3 = Deadpool.getTicketPrice();
		String price4 = IT.getTicketPrice();
		
		System.out.println(price);
		System.out.println(price1);
		System.out.println(price2);
		System.out.println(price3);
		System.out.println(price4);
		
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(TrainToBusan);
		queue.addMovie(Avatar);
		queue.addMovie(PacificRim);
		queue.addMovie(Deadpool);
		queue.addMovie(IT);
		queue.printMovies();
		Movie Bestmovie = queue.getBestMovie();
		}

}
