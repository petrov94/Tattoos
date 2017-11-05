package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tattoos")
public class AllImagesManager {
	  
	@Autowired
    ArtistRepository repository;
	@Autowired
	ImageRepository imRepository;

	
	@RequestMapping(value = "", method =  RequestMethod.GET)
		public @ResponseBody Iterable<Images> getAllImages() {
			return imRepository.findAll();
		}
			
}