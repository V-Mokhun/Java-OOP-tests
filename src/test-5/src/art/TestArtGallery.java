package art;

public class TestArtGallery {
	public static void main(String[] args) {
		ArtGallery artGallery = new ArtGallery("The Louvre", "Paris");
		artGallery.addPainting("Mona Lisa");
		artGallery.addPainting("The Wedding at Cana");
		artGallery.addPainting("The Raft of the Medusa");

		ContemporaryGallery contemporaryGallery = new ContemporaryGallery("The Guggenheim", "New York", 5);
		contemporaryGallery.addPainting("The Starry Night");
		contemporaryGallery.addPainting("The Persistence of Memory");
		contemporaryGallery.addPainting("The Scream");

		contemporaryGallery.removePainting("The Persistence of Memory");

		System.out.println(artGallery.toString());
		System.out.println(contemporaryGallery.toString());

	}
}
