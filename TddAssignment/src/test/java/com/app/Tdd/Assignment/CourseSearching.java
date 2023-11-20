package com.app.Tdd.Assignment;


	

	import java.util.HashMap;
import java.util.Map;
	public class CourseSearching {
 

		private Map<String, Integer> getcoursedata() {

			Map<String, Integer> courseMap = new HashMap<>();

			courseMap.put("DataAnalytics", 10);
		    courseMap.put("Python", 250);
			courseMap.put("JavaScripts ", 2);
			courseMap.put("Machine Learning", 50);
			return courseMap;

		}

		public int getPopulation(String course) {

			// if city is empty > provide message "city name cannot be empty
			// if city name not contains any valid key (valid city) city name does not
			// exist.
			// if we have valid city in our list then provide count of populations

			Map<String, Integer> courseMap = null;
			int count = 0;

			if (course.isEmpty()) {
				throw new NullPointerException("You can Enroll for the course.");
			}

			courseMap = getcoursedata();

			if (courseMap.containsKey(course)) {
				throw new NullPointerException("Courese does not exist");
			} else {
				count = courseMap.get(course);
			}

			return count;
		}
}
