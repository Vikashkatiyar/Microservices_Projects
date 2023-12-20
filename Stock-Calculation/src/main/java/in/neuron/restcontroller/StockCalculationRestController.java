package in.neuron.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.neuron.client.StockClient;

@RestController
@RequestMapping("/api/calc")
public class StockCalculationRestController {
	
	@Autowired
	private StockClient client;

	@GetMapping("/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> calculate(@PathVariable String companyName, 
									   @PathVariable Integer quantity) {
       
		ResponseEntity<?> responseEntity=null;
		Double totalPrice=null;
		System.out.println(companyName);
		System.out.println(quantity);
		
		try {
			
			responseEntity=client.getStockPrice(companyName);
			System.out.println(responseEntity);
			
			int statusCode=responseEntity.getStatusCode().value();
			if(statusCode==200) {
				Double companyStockPrice=(Double) responseEntity.getBody();
				totalPrice=quantity*companyStockPrice;
				String response="Total cost :: "+totalPrice;
				responseEntity=new ResponseEntity<String>(response, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			responseEntity=new ResponseEntity<String>("Company not Found" , HttpStatus.BAD_REQUEST);
			
		}
		
		return responseEntity;
	}
}
