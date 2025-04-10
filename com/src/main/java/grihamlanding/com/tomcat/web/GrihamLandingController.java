/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package grihamlanding.com.tomcat.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import grihamlanding.com.model.Course;
import grihamlanding.com.model.CurriculumItem;
import grihamlanding.com.model.PaymentHistory;
import grihamlanding.com.model.PaymentReq;
import grihamlanding.com.tomcat.service.GrihamLandingService;

@Controller
@CrossOrigin(
	    origins = {
	        "*"
	        
	        },
	    methods = {
	                RequestMethod.OPTIONS,
	                RequestMethod.GET,
	                RequestMethod.PUT,
	                RequestMethod.DELETE,
	                RequestMethod.POST
	})
public class GrihamLandingController {

	@Autowired
	private GrihamLandingService grihamLandingService;

	
	
	@GetMapping("/search")
	public ResponseEntity<List<Course>> getSearch(@RequestParam String search) {
		
		final HttpHeaders httpHeaders= new HttpHeaders();
	    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	    	    	
		return new ResponseEntity<>( grihamLandingService.getSearchedCourse(),httpHeaders, org.springframework.http.HttpStatus.OK);
	}
	
	@GetMapping("/payment")
	public ResponseEntity<PaymentReq> getPayment(@RequestParam String id) {
		
		final HttpHeaders httpHeaders= new HttpHeaders();
	    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	    	    	
		return new ResponseEntity<>( grihamLandingService.getPayment(),httpHeaders, org.springframework.http.HttpStatus.OK);
	}
	
	@GetMapping("/curriculum")
	public ResponseEntity<List<CurriculumItem>> getReview() {
		
		final HttpHeaders httpHeaders= new HttpHeaders();
	    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	    	    	
		return new ResponseEntity<>( grihamLandingService.getCurriculum(),httpHeaders, org.springframework.http.HttpStatus.OK);
	}
	
	@GetMapping("/paymenthistory")
	public ResponseEntity<Course> getPaymentHistory(@RequestParam String id) {
		
		final HttpHeaders httpHeaders= new HttpHeaders();
	    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	    	    	
		return new ResponseEntity<>( grihamLandingService.getPaymentHistory(id),httpHeaders, org.springframework.http.HttpStatus.OK);
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> getHello() {
		
		final HttpHeaders httpHeaders= new HttpHeaders();
	    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	    	    	
		return new ResponseEntity<>( "Helloooo",httpHeaders, org.springframework.http.HttpStatus.OK);
	}
}
