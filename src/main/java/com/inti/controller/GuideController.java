package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.CommentaireGuide;
import com.inti.entities.Guide;
import com.inti.service.interfaces.IGuideService;

@RestController
@CrossOrigin
public class GuideController {
	@Autowired 
	IGuideService guideService;

	//@Autowired
	//PasswordEncoder passwordEncoder;
	
	
	@GetMapping("guide") 
	public List<Guide> findAll() {
		return guideService.findAll();
	}

	@GetMapping("guide/{id}")
	public Guide findOne(@PathVariable("id") Long idGuide) { 
		return guideService.findOne(idGuide);
	}

	@PostMapping("guide")
    public String saveGuide(@RequestParam ("descriptionG") String description, @RequestParam ("paysG")String pays, 
            @RequestParam ("villeG") String ville, @RequestParam ("prix")String prix, @RequestParam ("fileU") MultipartFile file) {
        try {
            Guide currentGuide = new Guide();
            currentGuide.setDescriptionGuide(description);
            currentGuide.setPaysGuide(pays);
            currentGuide.setVilleGuide(ville);
            currentGuide.setPrixGuide(Float.parseFloat(prix));
            currentGuide.setMediasGuide(file.getBytes());
            guideService.save(currentGuide);
            return "File uploaded successdully! filename"+file.getOriginalFilename();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "fail maybe you had uploaded the file before or the file's size > 500kb";
    }
	
	/*@PostMapping("guide")
	public Guide saveGuide(@RequestBody Guide guide) {
		Guide currentGuide=new Guide(guide.getDescriptionGuide(), 
				guide.getPaysGuide(),guide.getVilleGuide(), guide.getPrixGuide(), guide.getMediasGuide());
		return guideService.save(currentGuide);
	}*/

	@DeleteMapping("guide/{id}")
	public void deleteGuide(@PathVariable("id") Long idGuide) {
		guideService.delete(idGuide);
	}

	@PutMapping("guide/{id}")
	public Guide updateGuide(@PathVariable("id") Long idGuide, @RequestBody Guide guide) {
		guide.setIdGuide(idGuide);
		return guideService.save(guide);
	} 
	
	/*@PutMapping("guide/{id}")
	public Guide updateGuide(@PathVariable("id") Long idGuide, @RequestBody Guide guide) {
		Guide currentGuide = guideService.findOne(idGuide);
		currentGuide.setDescriptionGuide(guide.getDescriptionGuide());
		currentGuide.setPaysGuide(guide.getPaysGuide());
		currentGuide.setVilleGuide(guide.getVilleGuide());
		currentGuide.setPrixGuide(guide.getPrixGuide());
		currentGuide.setMediasGuide(guide.getMediasGuide());
		return guideService.save(currentGuide);
	}*/
}
