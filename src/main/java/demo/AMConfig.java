package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/config")
public class AMConfig {
	
	@Autowired
    ArtistRepository repository;
	@Autowired
	ImageRepository imRepository;

	@RequestMapping("")
	 public void run() throws Exception {
        // save a couple of customers
		
		List<String> list = new ArrayList<String>();
		list.add("http://24.media.tumblr.com/tumblr_md4prdP5aM1rbmrzho1_500.jpg");
		list.add("https://s-media-cache-ak0.pinimg.com/736x/05/ec/41/05ec41544f1450333d430ceb0eafd4de.jpg");
		list.add("http://www.tattooeasily.com/wp-content/uploads/2013/04/tribal-tattoos-for-girls-20.jpg");
		Artist artist0 = new Artist(0, "ivan@abv.bg", "ivanpass", "Ivan Ivanov", "0898111333", "Bulgaria", "Sofia", 3, "InkHome", "Studentski grad bl.41", "http://blog-cdn.tattoodo.com/wp-content/uploads/2014/02/3d27pavelangel.jpg?09b2aa", "www.randomink.org", "http://www.coupletattoo.com/wp-content/uploads/2015/03/half-sleeve-tattoos-ideas-for-men.jpg", list);
        repository.save(artist0);
        List<String> list1 = new ArrayList<String>();
		list1.add("http://static.framar.bg/filestore/ares_tatuirovka_emil_saparevski_framar.jpg");
		list1.add("http://div.bg/pictures/1384357_595_.jpg");
		list1.add("https://www.getlokal.me/uploads/photo_gallery/96/8/12/800x0/845f09a2111d8d5a080dd48a125b9edb21666947.jpg");
        Artist artist1 = new Artist(1, "emosaparevski@abv.bg", "azsumemo", "Emil Saparevski", "0898123543", "Bulgaria", "Sofia", 8, "Sofia Tattoo Ink", "Parchevich 55", "http://www.sofialive.bg/media/images/heroes/thumbs_422/1_90697852.jpg", null, "http://www.sofialive.bg/media/library/September-2012/5_901.jpg", list1 );
        repository.save(artist1);
        List<String> list2 = new ArrayList<String>();
		list2.add("http://tatuajesdemujeres.net/wp-content/uploads/2015/04/Tatuajes-de-Mujeres-en-el-Tobillo-2.jpg");
		list2.add("http://www.prettydesigns.com/wp-content/uploads/2013/12/Rose-tattoo-Japanese-tattoos.jpg");
		list2.add("http://www.beavertattoo.com/images/Natalia/N09.jpg");
		list2.add("http://media.creativebloq.futurecdn.net/sites/creativebloq.com/files/images/2013/01/oniwaka2.jpg");

        Artist artist2 = new Artist(2, "gosho@abv.bg", "ivanpass", "Georgi Dimov", "0888981393", "Bulgaria", "Varna", 6, "BlackSeaInk", "Briz 17", "http://s3.amazonaws.com/tattoohero_images/images/avatars/000/003/033/original/Tattoo-Inspiration-of-Batman-by-Dongkyu-Leeat-FY-Ink.jpg?1396542012", "www.varnatattoo.bg", "http://creativefan.com/important/cf/2012/11/octopus-tattoo/octopus-leg-tattoos.jpg", list2);
        repository.save(artist2);
        Artist artist3 = new Artist(3, "pesho@abv.bg", "ivanpass", "Petyr Stoqnov", "0892178213", "Bulgaria", "Plovdiv", 7, "Maina Ink", "Ivan Rilski 136A", "http://feedinspiration.com/wp-content/uploads/2015/05/Tribal-tattoo-arm-designs-for-men1.jpg", "www.mainite.com", null, null);
        repository.save(artist3);
        Artist artist4 = new Artist(4, "misho@abv.bg", "ivanpass", "Mihail Petrov", "0891134123", "Bulgaria", "Pernik", 5, "VinkelInk", "Vasil Levski 23", "http://24.media.tumblr.com/c1189b29294d99188fbfd71341be8950/tumblr_mj3vjcCOFw1qzt880o3_1280.jpg", "www.golfink.org", null, null);
        repository.save(artist4);
            	        
        imRepository.save(new Images(artist0, 0, "http://24.media.tumblr.com/tumblr_md4prdP5aM1rbmrzho1_500.jpg"));
		imRepository.save(new Images(artist0, 1, "https://s-media-cache-ak0.pinimg.com/736x/05/ec/41/05ec41544f1450333d430ceb0eafd4de.jpg"));
		imRepository.save(new Images(artist0, 2, "http://www.tattooeasily.com/wp-content/uploads/2013/04/tribal-tattoos-for-girls-20.jpg"));
		imRepository.save(new Images(artist1, 3, "http://static.framar.bg/filestore/ares_tatuirovka_emil_saparevski_framar.jpg"));
		imRepository.save(new Images(artist1, 4, "http://div.bg/pictures/1384357_595_.jpg"));
		imRepository.save(new Images(artist1, 5, "https://www.getlokal.me/uploads/photo_gallery/96/8/12/800x0/845f09a2111d8d5a080dd48a125b9edb21666947.jpg"));
		imRepository.save(new Images(artist2, 6, "http://tatuajesdemujeres.net/wp-content/uploads/2015/04/Tatuajes-de-Mujeres-en-el-Tobillo-2.jpg"));
		imRepository.save(new Images(artist2, 7, "http://www.prettydesigns.com/wp-content/uploads/2013/12/Rose-tattoo-Japanese-tattoos.jpg"));
		imRepository.save(new Images(artist2, 8, "http://www.beavertattoo.com/images/Natalia/N09.jpg"));
		imRepository.save(new Images(artist2, 9, "http://media.creativebloq.futurecdn.net/sites/creativebloq.com/files/images/2013/01/oniwaka2.jpg"));

		/*imRepository.save(new Images(artist0, 1, readingImage("C:\\Users\\Elena\\Desktop\\sources\\tattoos\\album\\1.jpeg")));
		imRepository.save(new Images(artist0, 2, readingImage("C:\\Users\\Elena\\Desktop\\sources\\tattoos\\album\\2.jpeg")));
		
		imRepository.save(new Images(artist1, 3, readingImage("C:\\Users\\Elena\\Desktop\\sources\\tattoos\\album\\3.jpeg")));
		imRepository.save(new Images(artist1, 4, readingImage("C:\\Users\\Elena\\Desktop\\sources\\tattoos\\album\\4.jpeg")));
		imRepository.save(new Images(artist1, 5, readingImage("C:\\Users\\Elena\\Desktop\\sources\\tattoos\\album\\5.jpeg")));
		
		imRepository.save(new Images(artist2, 6, readingImage("C:\\Users\\Elena\\Desktop\\sources\\tattoos\\album\\6.jpeg")));
		imRepository.save(new Images(artist2, 7, readingImage("C:\\Users\\Elena\\Desktop\\sources\\tattoos\\album\\7.jpeg")));
		imRepository.save(new Images(artist2, 8, readingImage("C:\\Users\\Elena\\Desktop\\sources\\tattoos\\album\\8.jpeg")));*/
		
		//Images a = new Images();
		//a.setCountOfImages(9);
	}
	
	
	public byte[] readingImage (String path){ 
					File file = new File(path);      
		            FileInputStream imageInFile = null;
					try {
						imageInFile = new FileInputStream(file);
						byte imageData[] = new byte[(int) file.length()];
						imageInFile.read(imageData);
						return imageData;
					} catch (IOException e) {
					} 
					finally{
						try {
							imageInFile.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					return null;
	}
		
}

