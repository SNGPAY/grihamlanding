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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import grihamlanding.com.model.Course;

@Component
public class GrihamLandingService {

	@Value("${name:World}")
	private String name;

	public String getHelloMessage() {
		return "Hello " + this.name;
	}

	
	public Course[] getSearchedCourse(){
		
		Course course1 = new Course();
		course1.setId("1");
		course1.setNum_reviews("10");
		course1.setPrice("10");
		course1.setSubtitle("Title1");
		course1.setTitle("Payment");
		course1.setImage_480x270("");
		
		Course course2 = new Course();
		course2.setId("2");
		course2.setNum_reviews("100");
		course2.setPrice("100");
		course2.setSubtitle("Title2");
		course2.setTitle("Maintenance");
		course2.setImage_480x270("");
		
		Course[] courseArray = {course1,course2};
		return courseArray;
	}
	
}
