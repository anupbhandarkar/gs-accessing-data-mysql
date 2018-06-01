package anup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@RequestMapping(path="/demo") 
public class MainController {

	@Autowired 
	private DocumentRepository documentRepository;
	@Autowired
	private RequestRepository requestRepository;
	@Autowired
	private OrderRepository orderRepository;
	
/*	@GetMapping(path="/all")
	public @ResponseBody Iterable<Documents> getAllUsers() {
		// This returns a JSON or XML with the users
		System.out.println(documentRepository.findAll());
		return documentRepository.findAll();
	}*/
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Request> getAllUsers() {
		// This returns a JSON or XML with the users
		return requestRepository.findAll();
	}
	
	@PostMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestBody Document d
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
	/*	Documents d = new Documents();
	d.setDocumentnumber(documentnumber);
	d.setDocumentyear(documentyear);*/
		documentRepository.save(d);
		return "Saved";
	}
		

	}

