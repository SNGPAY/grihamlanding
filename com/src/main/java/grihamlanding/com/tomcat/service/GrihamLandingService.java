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

package grihamlanding.com.tomcat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


import grihamlanding.com.model.Course;
import grihamlanding.com.model.CurriculumItem;
import grihamlanding.com.model.Instructor;
import grihamlanding.com.model.Locale;
import grihamlanding.com.model.PaymentHistory;
import grihamlanding.com.model.PaymentReq;

@Component
public class GrihamLandingService {

	

	
	public List<Course> getSearchedCourse(){
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setNum_reviews("");
		course1.setPrice("");
		course1.setSubtitle("Title1");
		course1.setTitle("Notice 1");
		course1.setImage_480x270("");
		course1.setIs_paid(true);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setNum_reviews("");
		course2.setPrice("");
		course2.setSubtitle("Title2");
		course2.setTitle("Notice 2");
		course2.setImage_480x270("");
		course2.setIs_paid(true);
		
		Course course3 = new Course();
		course3.setId(3);
		course3.setNum_reviews("");
		course3.setPrice("");
		course3.setSubtitle("Title 3");
		course3.setTitle("Notice 3");
		course3.setImage_480x270("");
		course3.setIs_paid(true);
		
		Course course4 = new Course();
		course4.setId(4);
		course4.setNum_reviews("");
		course4.setPrice("");
		course4.setSubtitle("Title 4");
		course4.setTitle("Notice 4");
		course4.setImage_480x270("");
		course4.setIs_paid(true);
		
		List<Course> array = new ArrayList<Course>();
		array.add(course1);
		array.add(course2);
		array.add(course3);
		array.add(course4);
		System.out.println(array);
		
		return array;
	}
	
	public PaymentReq getPayment(){
		
		PaymentReq course = new PaymentReq();
		course.setId(1);
		course.setImage_125_H("");
		course.setImage_240x13("");
		course.setImage_240x135("");
		course.setImage_480x270("");
		course.setIs_paid(false);
		course.setIs_practise_test_course(false);
		Locale locale = new Locale();
		locale.setEnglish_title("TTTTT");
		locale.setSimple_english_title("T");
		locale.setTitle("RR");
		course.setLocale(locale);
		course.setNum_reviews("1");
		course.setPrice("100000");
		course.setPublished_title("Due");
		course.setResult("1");
		course.setSubtitle("T");
		course.setTitle("RRRRR");
		course.setTracking_id("1111111111111111111");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setTitle("A");
		Instructor[] instructors =  {
				instructor
	        };
		course.setVisible_instructors(instructors);
		return course;
	}
	
	public ArrayList< CurriculumItem> getCurriculum() {
		
		ArrayList< CurriculumItem> arrayList = new ArrayList<CurriculumItem>();	
		
		CurriculumItem curriculumItem = new CurriculumItem();
		curriculumItem.set_class("XI") ;
		//no check
		curriculumItem.setContent_summary("RR");
		curriculumItem.setDescription("");
		curriculumItem.setId(123);
		curriculumItem.setIs_free(true);
		curriculumItem.setTitle("Title");
		curriculumItem.setSort_order(2);
		
		CurriculumItem curriculumItem1 = new CurriculumItem();
		curriculumItem1.set_class("XI") ;
		//no check
		curriculumItem1.setContent_summary("RR");
		curriculumItem1.setDescription("");
		curriculumItem1.setId(124);
		curriculumItem1.setIs_free(true);
		curriculumItem1.setTitle("Title");
		curriculumItem1.setSort_order(2);
		arrayList.add(curriculumItem1);
		arrayList.add(curriculumItem);
		return arrayList;
	}
	
	public List<PaymentHistory> getPaymentHistory(String customerId){
		
		PaymentHistory paymentHistory1 = new PaymentHistory();
		paymentHistory1.setAmount("102.56");
		paymentHistory1.setDescription("Maintenance for month Jan 2025");
		paymentHistory1.setDate("02-Jan-2025");
		paymentHistory1.setStatus("Success");
		paymentHistory1.setTransactionid("#SDFDS34342421522");
		
		PaymentHistory paymentHistory2 = new PaymentHistory();
		paymentHistory2.setAmount("100.00");
		paymentHistory2.setDescription("Maintenance for Plumbing on Jan 2025");
		paymentHistory2.setDate("23-Jan-2025");
		paymentHistory2.setStatus("Success");
		paymentHistory2.setTransactionid("#SDFDS34342421524");
		
		List<PaymentHistory> histories = new ArrayList<PaymentHistory>();
		histories.add(paymentHistory2);
		histories.add(paymentHistory1);
		return histories;
	}
	
}
