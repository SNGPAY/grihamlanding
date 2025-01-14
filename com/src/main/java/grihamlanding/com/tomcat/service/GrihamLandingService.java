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
	
}
