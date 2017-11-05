package demo;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;



@RestController
@RequestMapping("/artists")
public class ArtistManager {
	  
	@Autowired
    ArtistRepository repository;
	@Autowired
	ImageRepository imRepository;

	
	@RequestMapping("")
		public @ResponseBody Object getAllArtists() {
			return repository.findAll();
		}
		
	
/*	@RequestMapping(value = "/{artistId}", method =  RequestMethod.GET)
		public @ResponseBody Artist getArtist(@PathVariable int artistId) {
			 return repository.findOne(artistId);
		    }*/
	
	@RequestMapping(value = "/{artistId}", method =  RequestMethod.GET)
	public @ResponseBody Artist getArtist(@PathVariable int artistId) {
			return repository.findOne(artistId);
	    }
		
	
	//@RequestMapping(value = "/{artistId}/{upload}", method =  RequestMethod.POST)
	/*public @ResponseBody void uploadImage(@PathVariable int artistId, @PathVariable MediaType.IMAGE_JPEG_VALUE upload){
		Artist tempArtist = new Artist(artistId, null, null, null, null, null, null);
		Images image = new Images();
		int indexOfImage = image.getCountOfImages();
		indexOfImage++;
		image = new Images(tempArtist, indexOfImage, upload);
		imRepository.save(image);
	}*/
	
	@RequestMapping(value = "/{artistId}/{imageId}", method =  RequestMethod.GET)
	public @ResponseBody String getArtist(@PathVariable int artistId,@PathVariable int imageId) {
		int temp = imageId;
		imageId = (artistId*3) + temp;
		return imRepository.findOne(imageId).getImg();
	}
	
	//nezavurshen
	@RequestMapping(value = "/rating/{artistId}/{rating}", method =  RequestMethod.GET)
	public @ResponseBody float getArtistRating(@PathVariable int artistId) {
		return repository.findOne(artistId).getRating();
	}
	
	
}
